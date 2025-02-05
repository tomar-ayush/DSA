
// There is Another solution with prunning
import java.util.List;
import java.util.ArrayList;

/**
 * combinationSum
 */
public class combinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<>();

		findCombination(ans, new ArrayList<Integer>(), candidates, 0, candidates.length, target);

		return ans;

	}

	public void findCombination(List<List<Integer>> ds, List<Integer> curr, int[] arr, int idx, int n, int target) {

		if (idx >= n) {

			if (target == 0) {
				ds.add(curr);
			}
			return;
		}

		if (target < 0) {
			return;
		}

		int curr_val = arr[idx];
		curr.add(curr_val);
		findCombination(ds, curr, arr, idx, n, target - curr_val);
		curr.remove(curr.size() - 1);
		findCombination(ds, curr, arr, idx + 1, n, target);

	}

}
