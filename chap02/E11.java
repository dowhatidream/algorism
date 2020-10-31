package chap02;

public class E11 {

	public static void main(String[] args) {
		int count = 0; // 나눗셈 횟수
		int countPrime = 0; // 찾은 소수 개수
		int[] prime = new int[5000]; // 소수를 저장할 배열. 대충 크기는 500

		prime[countPrime++] = 2; // 일단 배열의 countPrime위치에(=0) 첫번째 소수인 2를 대입 후 countPrime을 1 증가(후증가)
		// countPrime = 1;
		prime[countPrime++] = 3; // 일단 배열의 countPrime위치에(=1) 두번째 소수인 3을 대입 후 countPrime을 1 증가(후증가)
		// countPrime = 2;

		for (int n = 5; n <= 10000; n += 2) { // 3부터 시작해서 1000보다 같거나 작을때 까지 2씩 증가
											// 왜 홀수만 하냐? 2가 소수이기 때문에 2의 배수들은 합성수이므로 범위를 좀 줄이려고
											// => 에라토스테네스의 체
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				count += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				prime[countPrime++] = n;
				count++;
			}
		}

		for (int i = 0; i < countPrime; i++) {
			System.err.println(prime[i]);
		}

		System.out.println("총 소수 개수: " + countPrime);
		System.out.println("나눗셈 횟수: " + count);
	}
}
