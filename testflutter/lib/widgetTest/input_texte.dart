import 'package:flutter/material.dart';

class Inputs extends StatelessWidget {
  const Inputs({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: TextFormField(
        decoration: const InputDecoration(
          border: OutlineInputBorder(),
          labelText: 'Entrez votre nom',
        ),
      )
    );
  }
}
