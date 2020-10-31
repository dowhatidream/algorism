package chap05;

public class P04 {

	public static void main(String[] args) {
		recur(4);
	}
	
	static void recur(int n) {
		if (n > 0) {
			recur(n-2);
			System.out.println(n);
			recur(n-1);
		}
	}
}
