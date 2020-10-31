package chap06;

public class BubbleSort3 {

	public static void main(String[] args) {
		int[] a = { 3, 6, 14, 5, 1, 8, 9, 12, 4 };
		
		bubbleSort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}

	static void bubbleSort(int[] a) {
		int k = 0;
		while (k < a.length - 1) {
			int last = a.length - 1;
			for (int j = a.length - 1; j > k; j--) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					last = j;
				}
			}
			k = last;
		}
	}

}
