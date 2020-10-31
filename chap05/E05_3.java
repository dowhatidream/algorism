package chap05;

public class E05_3 {

	public static void main(String[] args) {
		recur(4);
	}
	
	static void recur(int n) {
		if (n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
}
