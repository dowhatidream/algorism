package chap02;

public class E03 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = a;
		int[] c = a.clone();
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		
		a[0] = 99;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(c[i]);
		}
	}

}
