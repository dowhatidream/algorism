package chap06;

public class Sort {

	public static void main(String[] args) {

	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	// 버블정렬: 두개씩 비교하면서 둘 중 큰 숫자를 오른쪽으로 swap
	public static void bubbleSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) { // Outer(패스): 두개씩 잡아서 비교하니까 전체에서 -1만큼 범위 잡기!
			for (int j = 0; j < n - i - 1; j++) { // Inner(횟수): k회전 할 때마다 큰 값은 이미 오른쪽에 가있으니까! 즉, i는 이미 위치가 확정된 값의 개수
				if (array[j] > array[j + 1]) { // 두개씩 잡았을 때 왼쪽값이 더 큰가?
					swap(array, j, j - 1); // 그렇담 큰값을 오른쪽으로 swap!
				}
			} // 1 path 끝! 여기까지 오면 요소 하나의 '최종 위치'가 확정됨
		}
	}

	// 선택정렬: 가장 작은 요소를 찾기 위해 순차적으로 이동
	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) { // Outer(패스)
			int min = i; // 일단 i번째 요소를 최솟값이라고 하자
			for (int j = i + 1; j < n; j++) { // Inner(횟수): 최솟값으로 설정한 i의 다음 요소부터 비교 시작! 배열 끝까지 비교
				if (array[j] < array[min]) { // j번째가 최솟값보다 작은가?
					min = j; // 그렇담 너가 최솟값 해! 아직 for문 안 끝났으니까 또 나올 수도 있겠지? 그래서 일단 저장만 해둠
				}
			}
			swap(array, i, min); // 1 path 끝! 여기까지 오면 최솟값 하나 확정! 요소 하나(방금 찾은 최솟값)의 '최종 위치'가 확정됨
		}
	}

	// 삽입정렬: 정렬된 어레이를 유지하며 크기를 늘려가면서 진행
	public static void insertionSort(int[] array) {
		int n = array.length;

		for (int i = 1; i < n; i++) { // Outer: (정렬된 부분의)크기를 2로 시작하려고 1부터 시작. i는 이미 정렬된 부분의 개수
			int temp = array[i]; // 일단 보관해두기
			int j = i - 1; // 정렬된 부분

			while (j >= 0 && array[j] > temp) { // Inner: 아직 끝까지 탐색하지 않았나? && 배열의 값이 temp보다 작은가?
				array[j + 1] = array[j]; // 그렇담 왼쪽으로 이동(덮어씌움)
				j--; // 하나씩 감소하면서 처음까지 비교
			}
			array[j + 1] = temp; // 1 path 끝! 여기까지 오면 일단 요소 하나 확정! 이 요소의 '임시 위치'가 확정됨. 왜 임시냐? 더 들어오니까!
		}
	}

	// 퀵정렬
	// 분할
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int part = partition(array, start, end); // 나 왔어..피벗 위치..나를 기준으로 다시 한번 분할해보렴

			quickSort(array, start, part - 1); // 나보다 작은 건 확실하거든? 근데 정렬여부는 모르겠어
			quickSort(array, part + 1, end); // 나보다 큰 건 확실하거든? 근데 정렬여부는 모르겠어
		}
	}

	// 정복
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end]; // 일단 가장 마지막 요소를 피벗으로
		int i = start - 1; // 어레이 안에서 피벗보다 작은 요소의 개수를 알려주는 역할

		for (int j = 1; j < end - 1; j++) {
			if (array[j] <= pivot) { // j번째 요소는 피벗보다 작나?
				i++; // 그렇다! 그러면 i값 증가
				swap(array, i, j); // 피벗보다 작은 너!(j) 여기 왼쪽으로 와라(i)
			}
		}
		swap(array, i + 1, end); // 피벗! 너보다 작은 애들(~i)은 여기 있으니까, 피벗 너는 i+1번째로 와라. ~i까지는 너보다 작은 건 확실해 근데..정렬 여부는 몰라ㅎㅎㅋ
		// 피벗: 뭐? 그러면 나는 위치가 확정인거네? 내 왼쪽은 나보다 작으니까 (나보다 작은 애들) (나) (나보다 큰 애들) 이렇게 되는군! 요소 하나의 최종 위치 확정★
		return i + 1; // 피벗의 위치를 리턴!
	}

}
