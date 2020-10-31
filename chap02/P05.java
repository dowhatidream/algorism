package chap02;

// 배열 b의 모든 요소를 배열a에 역순으로 복사하는  rcopy()
public class P05 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 2 };
		int[] b = { 2, 5, 87, 55, 4 };

		rcopy(b, a);
	}
	
	static void rcopy(int[] b, int[] a) {
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

		for (int i = 0; i < b.length / 2; i++) {
			int temp = b[i];
			b[i] = b[b.length - 1 - i];
			b[b.length - 1 - i] = temp;
		}

		a = b.clone();

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
