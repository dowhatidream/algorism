package chap04;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	public static void main(String[] args) {

	}

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		int num = front =  rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (Exception e) {
			max = 0;
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = x;
		num++;
		if (rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}
	
	// 큐 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}

	// 큐에서 x를 검색하여 인덱스 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % num;
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	// 큐 비우기
	public void clear() {
		num = front = rear = 0;
	}
	
	// 큐 용량 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여있는 데이터 수 반환
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if (num <= 0) {
			System.out.println("empty");
		}
		else {
			for (int i = 0; i < num; i++) {
				System.out.println(que[(i+front) % max] + "");
			}
			System.out.println();
		}
	}
	
}