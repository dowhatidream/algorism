package chap02;

import java.util.Scanner;

public class E13 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년, [0][]
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년, [1][]
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("year: ");
			int year = sc.nextInt();
			System.out.print("month: ");
			int month = sc.nextInt();
			System.out.print("day: ");
			int day = sc.nextInt();

//			System.out.println("그 해의 " + dayOfYear(year, month, day) + "일째입니다.");
			dayOfYear2(year, month, day);

			System.out.println("계속 할까요? (x 입력시 종료)");
			String next = sc.next();
			if (next.matches("x"))
				break;
		}
	}

	static int isLeap(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 4 == 0) ? 1 : 0;
	}

	static int dayOfYear(int year, int month, int day) {
		int sum = day;
		for (int i = 0; i < mdays.length; i++) {
			sum += mdays[isLeap(year)][i];
		}
		return sum;
	}

	static void dayOfYear2(int year, int month, int day) { // 3
		while (month > 1) {
			day += mdays[isLeap(year)][month - 2]; // 1,0
			month--; // 2,1
		}
		System.out.println(day + "일째");
	}

}
