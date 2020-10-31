package chap01;

// n이 7이면 1+2+...+7
public class P07 {

	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		String s = "";

		for (int i = 0; i <= n; i++) {
			sum += i;

			if (i == 0) {
				s = "";
			} else {
				s = s + "+" + i + "";
			}
		}
		System.out.println(s + "=" + sum);
	}

}
