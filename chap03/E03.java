package chap03;

public class E03 {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, -23, 5, 88, 66, 3425, 3, 12, 0 }; // 10+1개짜리 배열 생성
		int key = 66; // 찾을 값

		int i = seqSearch(a, key); // 그러면 key를 어디서 찾았는지 볼게
		if (i == a.length - 1) // 배열의 맨끝에 있는 key를 찾았구나? 그렇다면 보초 전까지 일치하는 값이 없었다는 것이므로 실패
			System.out.println("검색 실패...");
		else // 보초 전에 일치하는 값이 있었다는 것이므로 성공
			System.out.println("검색 성공! " + key + "는 a[" + i + "]에 있네요.");
	}

	static int seqSearch(int[] a, int key) {
		int i = 0; // 인덱스로 사용할 변수
		a[a.length - 1] = key; // 배열의 끝에 key값을 삽입해줌(끝에다 삽입할 거니까 -1, 안 해주면 ArrayOutOfInd~~)

		while (true) {
			if (a[i] == key) // 배열의 i번째 요소가 key와 같다는 것은 검색 성공
				return i; // 성공했으면 일단 나와라~
			i++; // 위에서 비교 후 없으면 i를 1 증가
		}
	}
}
