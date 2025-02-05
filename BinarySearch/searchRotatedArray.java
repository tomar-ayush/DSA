class Solution {
	public boolean search(int[] arr, int target) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return true;
			}

			// If duplicates are detected
			if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
				// We cannot decide which part is sorted, just move the boundaries
				start++;
				end--;
			} else if (arr[start] <= arr[mid]) {
				// Left half is sorted
				if (arr[start] <= target && target < arr[mid]) {
					// Target is in the left half
					end = mid - 1;
				} else {
					// Target is in the right half
					start = mid + 1;
				}

			} else {
				// Right half is sorted
				if (arr[mid] < target && target <= arr[end]) {
					// Target is in the right half
					start = mid + 1;
				} else {
					// Target is in the left half
					end = mid - 1;
				}
			}
		}

		return false; // Target not found
	}
}
