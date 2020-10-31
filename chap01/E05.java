package chap01;

// 1부터 n까지의 정수 합 구하기(선증가)
public class E05 {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("i: " + i);
			sum += i;
		}

		System.out.println(sum);
	}

}
    