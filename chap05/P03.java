package chap05;

// 이거 다시 풀기!!!!!!
public class P03 {

	public static void main(String[] args) {
		int[] a = { 35, 5, 74, 25 };
		System.out.println(gcdArray(a));
	}

	static int gcdArray(int[] a) {
		int r = a[0] % a[1];
		for (int i = 0; i < a.length; i++) {
			r = a[i] % a[i+1];
			if (r != 0) {
				gcdArray(a);
			}
			else {
				break;
			}
		}
		return r;
	}
}
