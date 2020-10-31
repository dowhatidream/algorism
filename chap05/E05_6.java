package chap05;

public class E05_6 {
	static int count = 1;
	static int count2 = 1;
	static String[] a = {"a", "b", "c"};

	public static void main(String[] args) {
		move(3, 1, 3);
		
		System.out.println("-------------");
		
		move2(3, 1, 3);
	}

	static void move(int no, int x, int y) {
		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		System.out.println(count + ": [" + no + "]번 원반 {" + x + "} ---> {" + y + "}");
		count++;

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
	
	static void move2(int no, int x, int y) {
		if (no > 1) {
			move2(no - 1, x, 6 - x - y);
		}
		System.out.println(count2 + ": [" + no + "]번 원반 {" + a[x-1] + "} ---> {" + a[y-1] + "}");
		count2++;

		if (no > 1) {
			move2(no - 1, 6 - x - y, y);
		}
	}
}
