import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b, a));

        for (int gift : gifts) {
            pq.add(gift);
            sum += gift;
        }

        while (k-- > 0) {
            int largest = pq.poll();
            sum -= largest;

            int sqrt = (int) Math.sqrt(largest);
            pq.add(sqrt);
            sum += sqrt;

        }

        return sum;

    }
}
