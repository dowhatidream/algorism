package chap01;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드
public class P09 {

	public static void main(String[] args) {
		System.out.println(sumof(10, 1));
	}

	static int sumof(int a, int b) {
		int sum = 0;

		if (a == b) {
			sum = a + b;
		} else {
			if (a <= b) { // a...b
				sum = a;
			} else { // b..a
				sum = b;
				b = a;
				a = sum;
			}
			while (a < b) {
				System.out.println("a: " + a + "  b: " + b);
				a++;
				sum += a;
			}
		}

		return sum;
	}
}
