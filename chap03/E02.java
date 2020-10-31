package chap03;

public class E02 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, -23, 5, 88, 66, 3425, 3, 12 }; // 10개짜리 배열 생성
		int key = 66; // 찾을 값

		int i = seqSearch(a, key);
		if (i == a.length) {
			System.out.println("검색 실패");
		}
	}

	static int seqSearch(int[] a, int key) {
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println(key + "는 a[" + i + "]" + "에 있네요");
				break;
			}
		}
		return i;
	}
}
