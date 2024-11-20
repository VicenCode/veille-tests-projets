package com.example.test3

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.test3.composabletests.AnimationTexteChargement
import com.example.test3.composabletests.BarreProgres
import com.example.test3.composabletests.BoutonFlottant
import com.example.test3.composabletests.DropdownTest
import com.example.test3.composabletests.EcritureLectureLocale
import com.example.test3.composabletests.Graphique
import com.example.test3.composabletests.IconeCliquable
import com.example.test3.composabletests.InputTexte
import com.example.test3.composabletests.LayoutTest
import com.example.test3.composabletests.ListeDeroulante
import com.example.test3.composabletests.TexteAvecDecoration
import com.example.test3.composabletests.UIDynamique
import com.example.test3.ui.theme.Test3Theme

data class TestListItem(val titre: String, val path: String)

val listTestItems = listOf(
    TestListItem(titre = "Input Texte", path = "input_texte"),
    TestListItem(titre = "Icône Cliquable", path = "icone_cliquable"),
    TestListItem(titre = "Dropdown", path = "dropdown"),
    TestListItem(titre = "Liste Déroulante", path = "liste_deroulante"),
    TestListItem(titre = "UI Dynamique", path = "ui_dynamique"),
    TestListItem(titre = "Bouton Flottant", path = "bouton_flottant"),
    TestListItem(titre = "Texte Avec Décoration", path = "texte_decoration"),
    TestListItem(titre = "Layout", path = "layout"),
    TestListItem(titre = "Barre Progres", path = "barre_progres"),
    TestListItem(titre = "Animation Texte Au Chargement", path = "animation_chargement"),
    TestListItem(titre = "Graphique", path = "graphique"),
    TestListItem(titre = "Ecriture Et Lecture Locale", path = "ecriture_lecture")
)

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
    name = "setting"
)

class MainActivity : ComponentActivity() {
    lateinit var nameRepository: NameRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nameRepository = NameRepository(dataStore)
        setContent {
            val factory = MyAppViewModel.provideFactory(dataStore)
            val viewModel: MyAppViewModel = viewModel(factory = factory)

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppNavigation(viewModel)
            }
//            Test3Theme {
//            }
        }
    }
}

@Composable
fun AppNavigation(viewModel: MyAppViewModel) {
    val navController = rememberNavController()
    Column {
        IconButton(onClick = {navController.navigate("list")}) {
            Icon(Icons.Default.Home, contentDescription = "Back")
        }
        NavHost(navController = navController, startDestination = "list") {
            composable("list") { ItemList(navController) }
            composable("input_texte") { InputTexte() }
            composable("icone_cliquable") { IconeCliquable() }
            composable("dropdown") { DropdownTest() }
            composable("liste_deroulante") { ListeDeroulante() }
            composable("ui_dynamique") { UIDynamique() }
            composable("bouton_flottant") { BoutonFlottant() }
            composable("texte_decoration") { TexteAvecDecoration() }
            composable("layout") { LayoutTest() }
            composable("barre_progres") { BarreProgres() }
            composable("animation_chargement") { AnimationTexteChargement() }
            composable("graphique") { Graphique() }
            composable("ecriture_lecture") { EcritureLectureLocale(viewModel) }
        }
    }


}

@Composable
fun ItemList(navController: NavController) {
    LazyColumn {
        items(count = listTestItems.size) { index ->
            val item = listTestItems[index]
            TestListItem(
                titre = item.titre,
                onClick = { navController.navigate(item.path) }
            )
        }
    }
}

@Composable
fun TestListItem(titre: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)
            .clickable(onClick = onClick)
            .padding(16.dp)
    ) {
        Text(
            text = titre,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}


