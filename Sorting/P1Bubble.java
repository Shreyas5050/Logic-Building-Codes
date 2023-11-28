package cdac;

public class P1Bubble {

	public static void main(String[] args) {
		//1. Bubble Sort [Solution]
		 int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		 
		 int n=arr.length;
		 System.out.println("Sorted Array from Bubble sort");
		 BubbleSort(arr,n);
		 PrintArray(arr,n);
	}
	
	static void PrintArray(int arr[],int N) {
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void BubbleSort(int arr[],int N) {
		int temp;
		boolean Swapped;
		for(int i=0;i<N-1;i++) {
			Swapped=false;
			for(int j=0;j<N-i-1;j++) {
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				Swapped=true;
			}
				}
			
			
			if(Swapped==false) {
				break;
			}
		}
	}

}
