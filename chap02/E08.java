package chap02;

public class E08 {

	public static void main(String[] args) {
		char[] d = new char[10];
		cardConvR(123, 8, d);
	}

	static void cardConvR(int x, int r, char[] d) { // 정수x를 r진수로 변환해서 배열d에다 아랫자리부터 넣어두고 자릿수 반환
		int digit = 0; // 기수 변환 후 자릿수
		String dchar = "0123456789ABCDEF"; // 임의로 16진수까지만 할 수 있게 함

		while (x != 0) {
			d[digit++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		}

		System.out.print(r + "진수로 바꾼 결과는, " + digit + "자리의 ");
		for (char c : d) {
			System.out.print(c);
		}

	}
}
