package chap02;

// 배열 b의 모든 요소를 배열a에 복사하는  copy()
public class P04 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 2 };
		int[] b = { 2, 5, 5, 5, 5, 5, 5, 5 };

		copy(b, a);
	}

	static void copy(int[] b, int[] a) {
		System.out.println("===복사 전===");
		System.out.print("b: ");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("a: ");
		for (int i : a) {
			System.out.print(i + " ");
		}

//		a = b.clone();
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		

		System.out.println();
		System.out.println("===복사 후===");
		System.out.print("b: ");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("a: ");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
