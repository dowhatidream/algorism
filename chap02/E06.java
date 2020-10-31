package chap02;

public class E06 {

	public static void main(String[] args) {
		int[] a = { 3, 25, 6, 33, 8, 0, 12 };

		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(i + "번째입니다.");
			int temp = a[i]; // 먼저 임시공간에 배열의 i번째 값 저장(앞)
			a[i] = a[a.length - i - 1]; // 앞에다 배열의 뒷 값 저장
			a[a.length - i - 1] = temp;
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
