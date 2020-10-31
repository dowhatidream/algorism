package chap01;

// 직각이등변삼각형
public class P15 {

	public static void main(String[] args) {
		int n = 5; // 5줄만
		
		// 왼쪽 아래가 직각
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 왼쪽 위가 직각
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// 오른쪽 위가 직각
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("□");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 오른쪽 위가 직각
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
}
