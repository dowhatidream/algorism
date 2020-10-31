package chap01;

// 세 값의 중앙값 구하기
public class P04 {

	public static void main(String[] args) {
		System.out.println(median(12, 12, 14));
	}

	static int median(int a, int b, int c) {
		if (a >= b) {
			// _ a _ >= b _
			if (b >= c) { // 3
				// a >= b >= c
				return b;
			}
			else if (a >= c) { //2
				// a >= c >= b
				return c;
			}
			else { // 1
				// c > a  >= b
				return a;
			}
		}
		// _ b > _ a _
		else if (b <= c) {
			// c >= b > a 
			return b;
		}
		// b > _ a _
		else if (a <= c) {
			// b > c >= a
			return c;
		}
		// b > _ a
		else {
			return a;
		}
	}
}
