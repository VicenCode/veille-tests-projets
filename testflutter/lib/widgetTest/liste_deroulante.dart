import 'package:flutter/material.dart';

class ListeDeroulante extends StatelessWidget {
  const ListeDeroulante({super.key});

  static List<Text> listeText = List.generate(50, (index) {
    return Text("Texte ${index + 1}");
  });

  @override
  Widget build(BuildContext context) {
    return Scrollbar(
      thumbVisibility: true,
      child: ListView(
        children: listeText,
      ),
    );
  }
}