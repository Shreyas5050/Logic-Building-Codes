package cdac;

public class P2Quick {

	public static void main(String[] args) {
		// 2. Quick Sort [Solution]
		 int[] arr = { 10, 7, 8, 9, 1, 5 };

		 int N=arr.length;
		 System.out.println("Sorted Array through Quick Sort=");
		 quickSort(arr,0,N-1);
		 PrintArray(arr,N);
	}
	
	static void PrintArray(int a[],int N) {
		for(int i=0;i<N;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	static int partition (int arr[],int low,int high) {
		int pivot=arr[high];
		int i=(low-1);
		
		for(int j=low;j<=high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
static void swap(int arr[],int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
