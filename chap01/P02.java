package chap01;

// 세 값의 최솟값을 구하는 min3()
public class P02 {

	public static void main(String[] args) {
		System.out.println(min3(11, 3, 13));
	}

	static int min3(int a, int b, int c) {
		int min = a;
	
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		
		return min;
	}
}
