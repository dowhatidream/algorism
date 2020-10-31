package chap02;

import java.util.Random;
import java.util.Scanner;

// 사람수를 입력받고 키를 입력받아서 제일 큰 사람 구하기
public class P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int num = r.nextInt(10) + 1;
		System.out.print("사람 수: " + num + "\n");

		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100) + 100;
			System.out.print("키: " + a[i]);
			System.out.println();
		}
		System.out.println("가장 큰 사람은 " + maxof(a));

	}

	static int maxof(int[] a) {
		int max = a[0]; // 일단 배열의 첫번째 값이 가장 큰 값이라고 가정하고 대입.

		for (int i = 0; i < a.length; i++) { // 배열의 길이만큼 돌면서
			if (a[i] > max) { // 배열의 해당 인덱스값이 max보다 큰가?
				max = a[i]; // true면 max에 해당 인덱스값 대입
							// 이때 >=가 아니라 >인 이유는?
			}
		}

		return max; // 최댓값 반환
	}
}
