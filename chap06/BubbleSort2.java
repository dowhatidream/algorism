package chap06;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] a = { 3, 6, 14, 5, 1, 8, 9, 12, 4 };
		
		bubbleSort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int exchange = 0;
			for (int j = a.length - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchange++;
				}
			}
			if (exchange == 0) {
				break;
			}
		}

	}

}
