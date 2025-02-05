import java.util.List;

public class findKthRotation {
	public int findKRotation(List<Integer> arr) {
		// Code here
		int min_index = -1, min = Integer.MAX_VALUE;

		int start = 0, end = arr.size() - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr.get(start) <= arr.get(end)) {
				if (arr.get(start) < min) {
					min_index = start;
					min = arr.get(start);
				}
				break;
			}

			int c_min = min;
			if (arr.get(start) <= arr.get(mid)) {

				c_min = arr.get(start);
				start = mid + 1;

				if (c_min < min) {
					min_index = start;
					min = c_min;
				}

			} else {

				c_min = arr.get(mid);
				end = mid - 1;

				if (c_min < min) {
					min_index = mid;
					min = c_min;
				}

			}

		}

		return min_index;
	}

}
