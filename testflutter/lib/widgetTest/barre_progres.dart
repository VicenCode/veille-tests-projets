import 'package:flutter/material.dart';

class BarreProgres extends StatefulWidget {
  const BarreProgres({super.key});

  @override
  State<BarreProgres> createState() => _BarreProgresState();
}

class _BarreProgresState extends State<BarreProgres> with SingleTickerProviderStateMixin {
  late AnimationController _controller;

  @override
  void initState() {
    super.initState();

    _controller = AnimationController(
      vsync: this,
      duration: const Duration(milliseconds: 700),
    )..forward();
  }

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Padding(
        padding: const EdgeInsets.all(20),
        child: AnimatedBuilder(
          animation: _controller,
          builder: (context, child) {
            return LinearProgressIndicator(
              backgroundColor: Colors.blueGrey,
              value: _controller.value * 0.75,
              valueColor: const AlwaysStoppedAnimation(Colors.purple),
            );
          },
        ),
      ),
    );
  }
}
