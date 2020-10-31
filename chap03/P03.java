package chap03;

public class P03 {

	public static void main(String[] args) {
		int[] a = { 1, 9, 2, 9, 4, 6, 7, 9 };
		int[] idx = new int[a.length];
		int key = 9;

		searchIndex(a, idx, key);
	}

	public static void searchIndex(int[] a, int[] idx, int key) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				idx[count++] = i;
			}
		}

		for (int i : idx) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("count: " + count);
	}
}
