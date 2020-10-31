package chap01;

public class E02 {

	public static void main(String[] args) {
		ifs(4);
		System.out.println("==============");
		elseifs(4);
	}

	static void ifs(int n) {
		if (n % 2 == 0) {
			System.out.println("2의 배수 입니다");
		}
		if (n % 3 == 0) {
			System.out.println("3의 배수 입니다");			
		}
		if (n % 4 == 0) {
			System.out.println("4의 배수 입니다");			
		}
		if (n % 5 == 0) {
			System.out.println("5의 배수 입니다");			
		}
		else {
			System.out.println("저는 뭐죠?");
		}
	}
	
	static void elseifs(int n) {
		if (n % 2 == 0) {
			System.out.println("2의 배수 입니다");
		}
		else if (n % 3 == 0) {
			System.out.println("3의 배수 입니다");			
		}
		else if (n % 4 == 0) {
			System.out.println("4의 배수 입니다");			
		}
		else if (n % 5 == 0) {
			System.out.println("5의 배수 입니다");			
		}
		else {
			System.out.println("저는 뭐죠?");
		}
	}

}
