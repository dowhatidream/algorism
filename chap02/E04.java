package chap02;

// 배열요소 최댓값 구하기
public class E04 {

	public static void main(String[] args) {
		int[] a = { 2, 4, 23, 1, 4, 32, -3, 11 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max: " + max);
	}

}
