package chap01;

// 구구단 곱셈표
public class P12 {

	public static void main(String[] args) {
		for (int j = 1; j < 10; j++) {
			System.out.print("   "+j + "\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "| ");
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + "\t  ");
			}
			System.out.println();
		}
	}

}
