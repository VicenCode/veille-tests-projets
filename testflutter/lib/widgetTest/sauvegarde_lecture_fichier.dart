import 'dart:io';
import 'dart:async';

import 'package:flutter/material.dart';
import 'package:path_provider/path_provider.dart';

class EcritureLectureFichier extends StatefulWidget {
  const EcritureLectureFichier({super.key});

  @override
  State<EcritureLectureFichier> createState() => _EcritureLectureFichierState();
}

class _EcritureLectureFichierState extends State<EcritureLectureFichier> {
  String nom = '';
  String valeurInput = '';

  Future<String> get _localPath async {
    final directory = await getApplicationDocumentsDirectory();
    return directory.path;
  }

  Future<File> get _localFile async {
    final path = await _localPath;
    return File('$path/nom.txt');
  }

  Future<File> writeNom(String nom) async {
    final file = await _localFile;
    return file.writeAsString(nom);
  }

  Future<String> readNom() async {
    try {
      final file = await _localFile;
      final contents = await file.readAsString();
      return contents;
    } catch (e) {
      return 'No data Found';
    }
  }

  @override
  void initState() {
    super.initState();
    readNom().then((value) {
      setState(() {
        nom = value;
      });
    });
  }

  Future<void> _saveNom() async {
    setState(() {
      nom = valeurInput;
    });
    await writeNom(nom);
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          children: [
            Center(
              child: Text(nom),
            ),
          ],
        ),
        Row(
          children: [
            Expanded(
              child: TextField(
                decoration: InputDecoration(
                  labelText: "Changer Nom",
                  border: OutlineInputBorder(),
                ),
                onChanged: (e) => valeurInput = e,
              ),
            ),
            SizedBox(width: 20),
            TextButton(
              onPressed: _saveNom,
              child: Text("Sauvegarder"),
            ),
          ],
        ),
      ],
    );
  }
}
