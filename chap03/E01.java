package chap03;

public class E01 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, -23, 5, 88, 66, 3425, 3, 12 }; // 10개짜리 배열 생성
		int key = 88; // 찾을 값

		int i = seqSearch(a, key);
		if (i == a.length)
			System.out.println("검색 실패...");
		else
			System.out.println("검색 성공! " + key + "는 a[" + i + "]에 있네요.");
	}

	static int seqSearch(int[] a, int key) {
		int i = 0; // 인덱스로 사용할 변수
		int count = 0; // 시도 횟수 저장할 변수

		while (true) {
			count++; // 시도 횟수 증가
			System.out.print(i + " "); // i 출력
			if (i == a.length) { // 인덱스 i가 배열길이 n과 같은가?
				count--;
				break; // 검색 실패 후 종료
			}
			if (a[i] == key) // 배열의 i번째 요소가 key와 같은가?
				break; //  검색 성공 후 종료
			i++; // 위에서 비교 후 없으면 i를 1 증가
		}
		System.out.println("--> " + count + "번 시도함");

		return i;
	}
}
