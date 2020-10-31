package chap04;

public class IntStack {

	public static void main(String[] args) {

	}
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		int ptr = 0; // 스택의 현재 용량(포인터)
 		int max = capacity; // 최대 용량
		try {
			int[] stk = new int[max]; // 스택 본체용 배열 생성
		} catch (Exception e) {
			max = 0;
		}
	}
}
