import java.util.LinkedList;
import java.util.List;

public class BinaryString {

	public static void main(String[] args) {
		int n = 3; // Change this to the desired length of binary strings
		List<String> binaryStrings = generateBinaryStrings(n);
		System.out.println("Binary strings of length " + n + " without consecutive 1s:");
		for (String s : binaryStrings) {
			System.out.println(s);
		}
	}

	public static List<String> generateBinaryStrings(int n) {
		// code here
		List<String> lst = new LinkedList<String>();

		findB(lst, 0, "", n);
		return lst;

	}

	public static void findB(List<String> lst, int curr_i, String curr_s, int n) {

		if (curr_i == n) {

			boolean check = true;
			for (int i = 0; i < n - 1; i++) {
				if (curr_s.charAt(i) == '1' && curr_s.charAt(i + 1) == '1') {
					check = false;
				}
			}

			if (check == true) {
				lst.add(curr_s);
			}
			return;

		}

		curr_i += 1;
		findB(lst, curr_i, curr_s + "0", n);
		findB(lst, curr_i, curr_s + "1", n);

	}
}
