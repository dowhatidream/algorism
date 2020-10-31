package chap02;

// 100 이하의 소수 열거
public class E10 {

	public static void main(String[] args) {
		int count = 0; // 나눗셈 횟수
		int countPrime = 0; // 찾은 소수 개수
		int[] prime = new int[500]; // 소수를 저장할 배열. 대충 크기는 500

		prime[countPrime++] = 2; // 일단 배열의 countPrime위치에(=0) 첫번째 소수인 2를 대입 후 countPrime을 1 증가(후증가)
		// 여기서부터는 countPrime = 1;

		for (int n = 3; n <= 100; n += 2) { // 3부터 시작해서 1000보다 같거나 작을때 까지 2씩 증가
											// 왜 홀수만 하냐? 2가 소수이기 때문에 2의 배수들은 합성수이므로 범위를 좀 줄이려고
											// => 에라토스테네스의 체
			int i;
			for (i = 1; i < countPrime; i++) { // 이미 찾은 소수로 나누어 보자(합성수인지 아닌지 판단하려고)
				count++; // 나눗셈 횟수 1 증가시키기
				if (n % prime[i] == 0) { // n을 배열의 i번째 값으로 나눴는데 0인가?
					break; // 빠져나가기 => 배열(소수만 들어있음)의 값으로 나눠진다는 것은 n이 '합성수'라는 뜻이므로 소수가 아님. ex) 9, 15..
				}
			}

			if (countPrime == i) { // countPrime(지금까지 찾은 소수의 개수)와 i가 일치하는가? = 배열에 저장된 소수로 다 나눠보았나?
				prime[countPrime++] = n; // ㅇㅇ그러면 배열의 다음 인덱스에 n을 대입하고 countPrime 1 증가
			}
		}

		for (int i = 0; i < countPrime; i++) {
			System.err.println(prime[i]);
		}

		System.out.println("나눗셈 횟수: " + count);
	}
}
