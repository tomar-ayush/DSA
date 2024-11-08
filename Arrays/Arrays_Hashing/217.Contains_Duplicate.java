class Solution {
    public boolean containsDuplicate(int[] arr) {

        int i = 0, j = 1, n = arr.length;
	Arrays.sort(arr);
	    while (i < n - 1) {

	    if(arr[i] == arr[i + 1]) {
		return true;
	    }
	    i++;

	}

	return false;

    }
}
