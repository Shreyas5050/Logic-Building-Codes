package cdac;

public class P4Insertion {

	public static void main(String[] args) {
		// 4. Insertion Sort [Solution]

        int arr[] = { 12, 11, 13, 5, 6 };
        int N=arr.length;
        System.out.println("Insertion Sorted Array");
        InsertionSort(arr,N);
        PrintArray(arr,N);
	}
	
	static void PrintArray(int a[],int N) {
		for(int i=0;i<N;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void InsertionSort(int a[],int N) {
		//  int arr[] = { 12, 11, 13, 5, 6 };
		for(int i=1;i<N;i++) {
			int key=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
				
			}
			a[j+1]=key;
		}
	}

}
