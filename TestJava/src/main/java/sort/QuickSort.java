package sort;

public class QuickSort {

	/**
	 * ��������
	 * @param arr
	 * @param left
	 * @param right
	 */
	public void quickSort(int[] arr, int left, int right){
		int i = left;//�����е�һ�������±�
		int j = right;//���������һ�������±�
		int middle = arr[(i+j)/2];//�м���
		do{
			while(arr[i]<middle && i<right)i++;//�ҳ���߱��м��������
			while(arr[j]>middle && j>left)j--;//�ҳ��ұ߱��м���С����
			if(i <= j){//����ߴ�������ұ�С�������н���
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}while(i <= j);//�����߽���ʱֹͣ
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