package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,2,4,6,8};
		selectionSort(a);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	public static void selectionSort(int[] arr){//选择排序
		int minIndex;//最小项的下标
		for(int i=0;i<arr.length-1;i++){
			minIndex = i;
			for(int j=i+1;j<arr.length;j++){//每次扫描选择出最小项
				if(arr[j]<arr[minIndex])minIndex=j;
			}
			if(minIndex != i){//找到最小项交换
				int temp;
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}