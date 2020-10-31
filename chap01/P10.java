package chap01;

import java.util.Scanner;

// 두 변수 a b에 정수를 입력하고  b-a를 출력. 단 b에 입력한 값이 a 이하면 b의 값을 다시 입력하기
public class P10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();

		System.out.print("b의 값: ");
		int b = sc.nextInt();
		
		while (b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");
			b = sc.nextInt();
		}

		System.out.println("차는 " + (b - a));
	}

}
