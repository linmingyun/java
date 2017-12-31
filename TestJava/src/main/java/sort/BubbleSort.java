package sort;

public class BubbleSort {

	/**
	 * 冒泡排序
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]){//比较交换相邻元素
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{9,2,7,4,5,6,3,8,1};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
