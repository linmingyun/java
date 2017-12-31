package sort;

public class QuickSort {

	/**
	 * 快速排序
	 * @param arr
	 * @param left
	 * @param right
	 */
	public void quickSort(int[] arr, int left, int right){
		int i = left;//数组中第一个数的下标
		int j = right;//数组中最后一个数的下标
		int middle = arr[(i+j)/2];//中间数
		do{
			while(arr[i]<middle && i<right)i++;//找出左边比中间数大的数
			while(arr[j]>middle && j>left)j--;//找出右边比中间数小的数
			if(i <= j){//将左边大的数和右边小的数进行交换
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}while(i <= j);//当两者交错时停止
		if(i < right){
			quickSort(arr,i,right);
		}
		if(j > left){
			quickSort(arr,left,j); 
		}
	}

	public static void main(String[] args){
		int[] arr = new int[]{9,2,7,4,5,6,3,8,1};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}