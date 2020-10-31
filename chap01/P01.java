package chap01;

// 네 값의 최댓값을 구하는 max4()
public class P01 {

	public static void main(String[] args) {
		System.out.println(max4(23,3,13,14));
	}

	public static int max4(int a, int b, int c, int d) {
		int max = a; // 일단 첫번째 값을 max에 대입
		
		if (b > max) { // b가 max보다 크면
			max = b; // max에 b 대입. 이제 c,d랑 비교
		}
		if (c > max) { // b가 max보다 안 크면 오는 순서. c가 max보다 크면
			max = c; //
		}
		if (d > max) {
			max = d;
		}
		
		return max;
	}
}
