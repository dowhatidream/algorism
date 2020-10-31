package chap06;

public class Q1 {

	public static void main(String[] args) {
		int[] a = {4, 76, 21 , 7, 47, 34, 1, 44, 67, 25};
		
		bubble(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}

	static void bubble(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
