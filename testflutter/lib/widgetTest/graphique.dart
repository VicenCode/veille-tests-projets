import 'package:flutter/material.dart';
import 'package:fl_chart/fl_chart.dart';

class Graphique extends StatelessWidget {
  const Graphique({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: AspectRatio(
        aspectRatio: 1.4,
        child: Stack(
          children: <Widget>[
            Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                const SizedBox(height: 37),
                const Text(
                  'Progression de la semaine',
                  textAlign: TextAlign.center,
                  style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 37),
                Expanded(
                  child: Padding(
                    padding: const EdgeInsets.only(right: 10, left: 10),
                    child: LineChart(_buildLineChartData()),
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }

  LineChartData _buildLineChartData() {
    return LineChartData(
      gridData: const FlGridData(show: true),
      titlesData: FlTitlesData(
        bottomTitles: AxisTitles(
          sideTitles: SideTitles(
            showTitles: true,
            reservedSize: 22,
            interval: 1,
            getTitlesWidget: (double value, TitleMeta meta) {
              const days = ['LUN', 'MAR', 'MER', 'JEU', 'VEN', 'SAM', 'DIM'];
              return SideTitleWidget(
                axisSide: meta.axisSide,
                child: Text(
                  days[value.toInt()],
                  style: const TextStyle(
                    fontWeight: FontWeight.bold,
                    fontSize: 12,
                  ),
                ),
              );
            },
          ),
        ),
        leftTitles: AxisTitles(
          sideTitles: SideTitles(
            showTitles: true,
            interval: 200,
            getTitlesWidget: (double value, TitleMeta meta) {
              return Text(
                '${value.toInt()}',
                style: const TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 12,
                ),
              );
            },
          ),
        ),
        topTitles: const AxisTitles(
          sideTitles: SideTitles(showTitles: false)
        ),
        rightTitles: const AxisTitles(
          sideTitles: SideTitles(showTitles: false)
        )
      ),
      minX: 0,
      maxX: 6,
      minY: 0,
      maxY: 1200,
      lineBarsData: [
        LineChartBarData(
          spots: const [
            FlSpot(0, 1000),
            FlSpot(1, 800),
            FlSpot(2, 950),
            FlSpot(3, 700),
            FlSpot(4, 1100),
            FlSpot(5, 850),
            FlSpot(6, 900),
          ],
          color: Colors.deepPurple,
        ),
      ],
    );
  }
}
