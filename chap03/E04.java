package chap03;

public class E04 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 10개짜리 배열 생성
		int key = 7; // 찾을 값

		int center = binSearch(a, key);

		if (a[center] != key) {
			System.out.println("검색 실패!");
		}
		else {
			System.out.println("검색 성공! " + key + "는 a[" + center + "]에 있었군요.");			
		}
	}

	static int binSearch(int[] a, int key) {
		int start = 0; // 시작 인덱스
		int end = a.length - 1; // 끝 인덱스
		int center = 0;

		while (start <= end) {
			center = (start + end) / 2; // 중앙 인덱스
			if (a[center] == key) // 중앙값과 키가 같은 경우
				return center;
			else if (a[center] < key) // 중앙값이 키보다 작은 경우
				start = center + 1; // 앞에는 필요가 없으므로 start를 이동
			else // 중앙값이 키보다 큰 경우
				end = center - 1; // 뒤에는 필요가 없으므로 end를 이동
		}
		return center;
	}
}
