import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));

        int n = classes.length;
        if (extraStudents > 0) {
            for (int i = 0; i < n; i++) {
                double possibleIncreament = findIncreament(i, classes);
                pq.offer(new double[] { (double) i, possibleIncreament });
            }
        }

        for (int i = 0; i < extraStudents; i++) {

            int largestIncrementIdx = (int) pq.remove()[0];
            classes[largestIncrementIdx][0]++;
            classes[largestIncrementIdx][1]++;

            pq.add(new double[] { largestIncrementIdx, findIncreament(largestIncrementIdx, classes) });

        }
        double sol = 0;

        for (int i = 0; i < n; i++) {
            sol += (double) classes[i][0] / classes[i][1];
        }
        return sol / n;

    }

    public static double findIncreament(int i, int[][] classes) {
        double currAvg = (double) classes[i][0] / classes[i][1];
        double avgAfterIncreament = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
        double difference = (double) (currAvg - avgAfterIncreament);
        return difference;
    }
}
