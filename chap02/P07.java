package chap02;

import java.util.Scanner;

public class P07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양수 입력: ");
		int x = sc.nextInt();

		System.out.println("변환할 진수 입력: ");
		int r = sc.nextInt();

	}

	static void conv(int x, int r, char[] d) {
		int digit = 0; // 각 자리를 저장할 변수
		String dchar = "0123456789ABCDEF"; // 임의로 16진수까지만 할 수 있게 함

		while (true) {
			System.out.println(r + " | " + "\t" + x);
			System.out.println("--------------");

			while (x != 0) {
				System.out.println(r + " | " + "\t" + x + "   (" + (x % r) + ")");
				System.out.println("--------------");
			}
			break;
		}
	}
}
