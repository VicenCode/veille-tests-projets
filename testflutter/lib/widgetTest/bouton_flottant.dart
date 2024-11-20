import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class BoutonFlottant extends StatelessWidget {
  const BoutonFlottant({super.key});

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Expanded(
          child: ListView.builder(
            itemCount: 30,
            itemBuilder: (context, index) {
              return Column(
                children: [
                  Container(
                    decoration: BoxDecoration(color: Colors.purple[300]),
                    height: 50,
                  ),
                  const SizedBox(
                    height: 20,
                  )
                ],
              );
            },
          
          ),
        ),
        FloatingActionButton(
          onPressed: () => debugPrint("Bouton flottant appuyé!!"),
          child: const Icon(Icons.add),
        ),
      ],
    );
  }
}
