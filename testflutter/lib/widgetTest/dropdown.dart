import 'package:flutter/material.dart';

class Dropdown extends StatefulWidget {
  const Dropdown({super.key});

  @override
  State<Dropdown> createState() => _DropdownState();
  }

  class _DropdownState extends State<Dropdown> {

    String selectedValue = "V1";

    static const List<DropdownMenuItem> dropdownItems = [
      DropdownMenuItem(value: "V1", child: Text("V1")),
      DropdownMenuItem(value: "V2", child: Text("V2")),
      DropdownMenuItem(value: "V3", child: Text("V3")),
      DropdownMenuItem(value: "V4", child: Text("V4")),
      DropdownMenuItem(value: "V5", child: Text("V5")),
    ];

    void changerValeur(valeur) {
      setState(() {
        selectedValue = valeur;
      });
      debugPrint('Valeur Courrante: $valeur');
    }

    @override
    Widget build(BuildContext context) {


      return Center(
        child: DropdownButton(
          value: selectedValue,
          items: dropdownItems,
          onChanged: (value) => changerValeur(value),
        )
      );
    }
  }