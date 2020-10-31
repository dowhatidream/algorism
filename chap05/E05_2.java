package chap05;

public class E05_2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 2342;
		
		System.out.println(gcd(x, y));
		System.out.println(gcd2(x, y));
	}

	// 유클리드 호제법 재귀함수로 풀기
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
		else
			return gcd(y, x%y);
	}
	
	// 유클리드 호제법 while로 풀기
	static int gcd2(int x, int y) {
		int r = x%y; // y가 0이 아니라는 가정 하에 풂!
		while (r != 0) {
			x = y; // 몫
			y = r; // 나머지
			r = x%y; // 나머지
		}
		return y;
	}
}
