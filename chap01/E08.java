package chap01;

// 직각이등변삼각형
public class E08 {

	public static void main(String[] args) {
		int n = 5; // 5줄만
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
