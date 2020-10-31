package chap01;

public class E01 {

	public static void main(String[] args) {
		System.out.println(max3(1, 2, 3));
		System.out.println(E01.max3(1, 3, 2));
	}

	static int max3(int a, int b, int c) {
		int max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}

		return max;
	}
}
