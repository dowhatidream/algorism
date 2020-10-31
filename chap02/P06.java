package chap02;

public class P06 {

	public static void main(String[] args) {
		char[] d = new char[40];
		
		cardConv(123, 8, d);
	}

	static void cardConv(int x, int r, char[] d) {
		int digit = 0;
		String dchar = "0123456789ABCDEF"; // 임의로 16진수까지만 할 수 있게 함

		while (x != 0) {
			d[digit++] = dchar.charAt(x % r); // x를 r로 나눈 나머지가 dchar배열 인덱스가 되어 해당하는 값을 d[0]에 대입후 digit 1 증가
			x /= r; // 몫 구하려고(위에는 나머지만 구했으니까! 몫이 나와야 계속 수행하지)
		}

		System.out.println("==역순으로 찍힘==");
		for (char c : d) {
			System.out.print(c);
		}

		for (int i = 0; i < digit / 2; i++) {
			char t = d[i];
			d[i] = d[digit - 1 - i];
			d[digit - 1 - i] = t;
		}
		
		System.out.println();
		System.out.println("==정렬한 최종==");
		for (char c : d) {
			System.out.print(c);
		}
	}
}
