package chap03;

public class P02 {

	public static void main(String[] args) {
		int[] a = { 6, 4, 3, 2, 1, 9, 8 };
		int key = 9;

		int index = linearSearch(a, key);
		if (index != -1)
			System.out.println("wow! " + key + " is at " + index);
	}

	public static int linearSearch(int[] a, int key) {
		System.out.println("  |  0  1  2  3  4  5  6");
		System.out.println("------------------------");

		for (int i = 0; i < a.length; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < a.length; j++) {
				if (j == i) {
					System.out.print("[" + a[j] + "]");
				} else {
					System.out.print(" " + a[j] + " ");
				}
			}
			System.out.println();
			if (a[i] == key)
				return i;
		}
		return -1;
	}
}
