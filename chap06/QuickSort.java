package chap06;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {7, 26, 3, 23, 14, 17, 20, 10, 5};
		System.out.println("정렬 전");
		print(a);
		quickSort(a);
		System.out.println();
		System.out.println("정렬 후");
		print(a);
	}

	// 정렬할 배열
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	// 퀵소트: 피벗을 정한뒤 피벗의 위치를 확정해가며 정렬
	// 분할
	public static void quickSort(int[] array, int start, int end) {
		int part = partition(array, start, end);
		
		if (start < part - 1) { // 파티션이 시작값 바로 옆에 있으면 왼쪽에는 하나만 있다는 뜻이므로 1개 이상 차이나면 들어오는 걸로
			quickSort(array, start, part - 1); // 오른쪽 파티션의 끝나는 지점 바로 전으로 지정(-1)
		}
		if (part < end) {
			quickSort(array, part, end);
		}
		// 요소가 하나밖에 없으면..start와 end가 같으면 끝남
	}

	// 정복
	public static int partition(int[] array, int start, int end) {
		int pivot = array[(start+end)/2]; // 기준으로 잡을 애는 바로바로 중간 지점!
		
		while (start <= end) {
			while (array[start] < pivot) { // 왼쪽
				start++; // 배열의 값이 피벗보다 작으면 넘어갈 거야
			}
			while (array[end] > pivot) { // 오른쪽
				end--; // 배열의 값이 피벗보다 크면 넘어갈 거야
			}
			if (start <= end) { // 혹시 너네 지나친 건 아니지?
				swap(array, start, end);
				start++;
				end--;
			}
		}
		return start; // 오른쪽 파티션의 첫번째 인덱스
	}

	public static void swap(int[] array, int start, int end) {
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
	}
	
	public static void print(int[] array) {
		for (int a : array) {
			System.out.print(a + " / ");
		}
	}

}
