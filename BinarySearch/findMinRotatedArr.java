class Solution {
	public int findMin(int[] nums) {

		int start = 0;
		int end = nums.length - 1;
		int min = Integer.MAX_VALUE;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			// check for sorted Array

			int c_min = min;
			// check if the left part is sorted
			if (nums[start] <= nums[mid] && nums[mid] >= nums[mid]) {

				c_min = nums[start];
				start = mid + 1;

			} else {

				c_min = nums[mid];
				end = mid - 1;

			}

			min = Math.min(min, c_min);

		}

		return min;

	}
}
