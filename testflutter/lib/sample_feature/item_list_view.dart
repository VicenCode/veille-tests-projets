import 'package:flutter/material.dart';
import 'package:testflutter/sample_feature/item_details_view.dart';
import 'package:testflutter/widgetTest/barre_progres.dart';
import 'package:testflutter/widgetTest/bouton_flottant.dart';
import 'package:testflutter/widgetTest/button_incremente.dart';
import 'package:testflutter/widgetTest/dropdown.dart';
import 'package:testflutter/widgetTest/graphique.dart';
import 'package:testflutter/widgetTest/icone_cliquable.dart';
import 'package:testflutter/widgetTest/input_texte.dart';
import 'package:testflutter/widgetTest/layout.dart';
import 'package:testflutter/widgetTest/liste_deroulante.dart';
import 'package:testflutter/widgetTest/sauvegarde_lecture_fichier.dart';
import 'package:testflutter/widgetTest/texte_decoration.dart';
import '../widgetTest/page_navigation.dart';

import 'item.dart';

class ItemListView extends StatelessWidget {
  const ItemListView({
    super.key,
    this.items = const [
      Item("Animation chargement", PageNavigation()),
      Item("Input Texte", Inputs()),
      Item("Graphique", Graphique()),
      Item("Icône Cliquable", IconeCliquable()),
      Item("Dropdown", Dropdown()),
      Item("Barre de Progres", BarreProgres()),
      Item("Liste Deroulante", ListeDeroulante()),
      Item("Texte Avec Décoration (pour titres, badges)", TexteDecoration()),
      Item("UI Dynamique", ButtonIncremente()),
      Item("Layout", LayoutTest()),
      Item("Bouton Flottant", BoutonFlottant()),
      Item("Sauvegarde et Lecture localement", EcritureLectureFichier())
    ],
  });

final List<Item> items;

@override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView.builder(
        itemCount: items.length,
        itemBuilder: (BuildContext context, int index) {
          final test = items[index];

          return ListTile(
              title: Text(test.title),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                      builder: (context) => ItemDetailsView(itemDetails: test)),
                );
              });
        },
      ),
    );
  }
}
