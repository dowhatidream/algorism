package chap01;

import java.util.Scanner;

// 1부터 n까지의 정수 합 구하기(선증가)
public class E04 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		System.out.print("어디까지 더할래?  ");
		int n = new Scanner(System.in).nextInt();
		
		while (i < n) {
			System.out.println("시작할때 i: " + i);
			i++;
			System.out.println("끝날때 i: " + i);
			sum += i;
			System.out.println("===============");
		}
		System.out.println(sum);
	}

}
