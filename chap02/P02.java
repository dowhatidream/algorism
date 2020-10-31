package chap02;

public class P02 {

	public static void main(String[] args) {
		int[] a = { 5, 10, 73, 2, -5, 42 };

		System.out.println("====정렬 준비====");
		for (int i : a) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(i + "번째: " + "a[" + i + "], " + "a[" + (a.length - 1 - i) + "] 교환");
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

			for (int j : a) {
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("====정렬 완료====");

		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
