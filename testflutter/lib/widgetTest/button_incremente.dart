import 'package:flutter/material.dart';

class ButtonIncremente extends StatefulWidget {
  const ButtonIncremente({super.key});

  @override
  State<ButtonIncremente> createState() => _ButtonIncrementeState();
  
}

class _ButtonIncrementeState extends State<ButtonIncremente> {

  int counter = 0;

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        children: [
          Text('$counter'),
          IconButton(
            onPressed: () => setState(() {
            counter++;
          }), 
          icon: const Icon(Icons.add),
          )
        ],
      ),
    );
  }
}