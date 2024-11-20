import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class LayoutTest extends StatelessWidget {
  const LayoutTest({super.key});

  static final BoxDecoration _boxDecoration = BoxDecoration(
    color: Colors.purple[300],
    borderRadius: BorderRadius.circular(12)
  );

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding:  const EdgeInsets.all(15), 
      child: Container(
        height: 400,
        child: Column(
          children: [
            Container(
              height: 80,
              decoration: _boxDecoration,
            ),
            const SizedBox(
              height: 12,
            ),
            Expanded(
              child: Row(
                children: [
                  Container(
                    width: 200,
                    decoration: _boxDecoration,
                  ),
                  const SizedBox(
                    width: 12,
                  ),
                  Expanded(child: Column(
                    children: [
                      Container(
                        height: 100,
                        decoration: _boxDecoration,
                      ),
                      SizedBox(
                        height: 12,
                      ),
                      Container(
                        height: 80,
                        decoration: _boxDecoration,
                      )
                    ],
                  ))
                ],
              ))
          ],
        ),
      ),);
  }
}