package cdac;

public class P1 {

	public static void main(String[] args) {
		// 1. Linear Search [Solution]

		int arr[]= {23,45,67,10,50};
		int key=50;
		int a=arr.length;
		int res=LinearSearch(arr,a,key);
		if(res==-1) {
			System.out.println("Element is not found in array");
		}
		else {
			System.out.println("Element is found at the index ="+res);
		}
	}
	
	static int LinearSearch(int a[],int N,int key) {
		
		for(int i=0;i<N;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		
		
		return -1;
	}

}
