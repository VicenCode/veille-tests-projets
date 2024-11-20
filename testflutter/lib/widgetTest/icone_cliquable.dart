import 'package:flutter/material.dart';

class IconeCliquable extends StatelessWidget {
  const IconeCliquable({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: IconButton(
        onPressed: () => debugPrint("Icône appuyé!"), 
        icon: const Icon(Icons.person),
        ),
    );
  }
}