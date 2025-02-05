import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class combinationSumTwo {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(candidates);

		combination(ans, new ArrayList<>(), candidates, 0, target);

		return ans;
	}

	public void combination(List<List<Integer>> ds, List<Integer> curr, int[] arr, int idx, int target) {

		if (target == 0) {

			ds.add(new ArrayList<>(curr));

		}

		for (int i = idx; i < arr.length; i++) {

			if (i > idx && arr[i] == arr[i - 1])
				continue;

			if (arr[i] > target)
				return;
			curr.add(arr[i]);
			combination(ds, curr, arr, i + 1, target - arr[i]);
			curr.remove(curr.size() - 1);
		}
	}

}
