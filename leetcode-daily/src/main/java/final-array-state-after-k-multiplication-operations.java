import java.util.PriorityQueue;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            int valueComparison = Integer.compare(a[1], b[1]);
            if (valueComparison == 0) {
                return Integer.compare(a[0], b[0]);
            }
            return valueComparison;
        });
        for (int i = 0, n = nums.length; i < n; i++) {
            pq.add(new int[] { i, nums[i] });
        }

        for (int i = 0; i < k; i++) {

            int[] least_ele = pq.remove();
            int idx = least_ele[0];

            nums[idx] = least_ele[1] * multiplier;

            pq.add(new int[] { idx, least_ele[1] * multiplier });

        }

        return nums;

    }
}
