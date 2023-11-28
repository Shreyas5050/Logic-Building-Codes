package cdac;

public class P3Selection {

	public static void main(String[] args) {
		// 3. Selection Sort [Solution]
	     int arr[] = {64,25,12,22,11};
	     int N=arr.length;
	     System.out.println("Sorted Array=>");
	     SelectionSort(arr,N);
	     PrintArray(arr,N);
	}
	static void PrintArray(int []a,int Num) {
		for(int i=0;i<Num;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void SelectionSort(int a[],int N) {
		for(int i=0;i<N-1;i++) {
			int minindex=i;
			for(int j=i+1;j<N;j++) {
				if(a[j]<a[minindex]) {
					minindex=j;
					int temp=a[minindex];
					a[minindex]=a[i];
					a[i]=temp;
				}
			}
		}
	}

}
