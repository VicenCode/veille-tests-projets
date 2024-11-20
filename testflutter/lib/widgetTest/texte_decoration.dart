import 'package:flutter/material.dart';

class TexteDecoration extends StatelessWidget {
  const TexteDecoration({super.key});

  @override
  Widget build(BuildContext context) {
    return const Center(
      child: Chip(
        label: Text("Novice"),
        side: BorderSide(color: Colors.purple),
        shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.all(Radius.circular(6))),
        padding: EdgeInsets.only(top: 0, bottom: 0),
        labelPadding: EdgeInsets.only(left: 5, right: 5, top: 0, bottom: 0),
        labelStyle: TextStyle(fontSize: 12, fontStyle: FontStyle.italic),
      ),
    );
  }
}
