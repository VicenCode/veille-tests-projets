import 'package:flutter/material.dart';
import 'package:testflutter/sample_feature/item.dart';

/// Displays detailed information about a SampleItem.
class ItemDetailsView extends StatelessWidget {
  final Item itemDetails;

  const ItemDetailsView({super.key, required this.itemDetails});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(itemDetails.title),
        ),
        body: itemDetails.widget);
  }
}
