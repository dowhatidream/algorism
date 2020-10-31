package chap01;

// 네 값의 최솟값을 구하는 min4()
public class P03 {

	public static void main(String[] args) {
		System.out.println(min3(11, 3, -13, 23));
	}

	static int min3(int a, int b, int c, int d) {
		int min = a;
	
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		
		return min;
	}
}
