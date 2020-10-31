package chap05;

public class E05 {

	public static void main(String[] args) {
		int x = 8;
		System.out.println(x+"의 팩토리얼은1 " + factorial(x));
		System.out.println(x+"의 팩토리얼은2 " + getSum(x));
		System.out.println(x+"의 팩토리얼은3 " + getSum2(x));
	}

	// 재귀함수를 사용한 팩토리얼 구하기
	static int factorial(int n) {
		if (n > 0) { // n이 0보다 큰가?
			return n * factorial(n-1); // 5! = 5 * 4!, 4! = 4 * 3!..
		}
		else {
			return 1;
		}
	} // 재귀: 5! = 5 * 4 * 3 * 2 * 1
	
	// for 반복문을 사용한 팩토리얼 구하기
	static int getSum(int n) {
		int sum = 1; // 곱셈 연산이므로 0이 아닌 1로 sum 잡아주기
		for (int i = 2; i <= n; i++) { // 다음 수는 2로 잡는게 연산을 덜 하겠죠?
			sum = sum * i;
		}
		return sum;
	} // 반복: 5! = 1 * 2 * 3 * 4 * 5
	
	// while 반복문을 사용한 팩토리얼 구하기
	static int getSum2(int n) {
		int sum = 1;
		int i = 2;
		while (i <= n) { // i가 n보다 작거나 같으면
			sum *= i;
			i++;
		}
		return sum;
	}
}
