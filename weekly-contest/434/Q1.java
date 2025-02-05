class Q1 {

	public static void main(String[] args) {
		Q1 s1 = new Q1();
		int[] n = new int[] { 10, 10, 3, 7, 6 };
		int result = s1.countPartitions(n);
		System.out.println("Number of valid partitions: " + result);
	}

	public int countPartitions(int[] nums) {

		int sol = 0;

		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		int left = 0;
		int right = sum;

		for (int i = 0; i < nums.length - 1; i++) {
			int curr = nums[i];
			left = left + curr;
			right = right - curr;

			if ((left - right) % 2 == 0) {
				System.out.println("left: " + left + "right " + right);
				sol++;
			}

		}

		return sol;

	}
}
