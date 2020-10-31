package chap03;

public class P04 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 9 };
		int key = 2;

		int index = linearSearch(a, key);
		if (index != -1)
			System.out.println("wow! " + key + " is at " + index);
	}

	public static int linearSearch(int[] a, int key) {
		int start = 0;
		int end = a.length - 1;
		System.out.println("  |  0  1  2  3  4  5  6");
		System.out.println("------------------------");

		for (int i = 0; i < a.length; i++) {
			int center = (start + end) / 2;
			System.out.print(center + " | ");
			if (center == key) {
				return center;
			} else if (center < key) {
				start = center + 1;
			} else {
				end = center - 1;
			}

			for (int j = 0; j < a.length; j++) {
				if (j == 0 || j == start) {
					System.out.print("[" + a[j]);
				}
				else if (j == a.length || j == end) {
					System.out.print(a[j] + "]");
				}
				else {
					System.out.print(a[j]);
				}
			}
			System.out.println();
			if (a[i] == key)
				return i;
		}
		
		return -1;
	}
}
