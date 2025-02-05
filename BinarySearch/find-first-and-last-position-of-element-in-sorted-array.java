class Solution {
	public int[] searchRange(int[] nums, int target) {

		int first = findLowest(nums, target, 0, nums.length - 1, -1);
		int last = findHighest(nums, target, 0, nums.length - 1, -1);
		return new int[] { last, first };

	}

	public int findHighest(int[] arr, int target, int low, int high, int first) {
		{
			/* int first = -1; */}

		if (low > high)
			return first;

		int mid = low + (high - low) / 2;

		if (arr[mid] == target) {
			first = mid;
			high = mid - 1;
		} else if (arr[mid] > target) {
			high = mid - 1;
		} else {
			low = mid + 1;
		}

		return findHighest(arr, target, low, high, first);

	}

	int findLowest(int[] arr, int target, int low, int high, int last) {

		if (low > high)
			return last;

		int mid = low + (high - low) / 2;

		if (arr[mid] == target) {
			last = mid;
			low = mid + 1;
		} else if (arr[mid] > target) {
			high = mid - 1;
		} else {
			low = mid + 1;
		}

		return findLowest(arr, target, low, high, last);

	}

}
