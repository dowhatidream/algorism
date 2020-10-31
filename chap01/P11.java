package chap01;

import java.util.Scanner;

// 양의 정수를 입력하고 자릿수를 출력. 135 입력시 그 수는 3자리
public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0; // 자릿수 판별할 수

		System.out.print("양의 정수: ");
		int a = sc.nextInt();

		while (a > 0) {
			a /= 10;
			n++;
		}
		System.out.println("최종 " + n);
	}

}
