 package cdac;

public class P16Optimised {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		RotateArray(arr,3);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	static void RotateArray(int arr[],int k) {
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		Reverse(arr,0,k-1);
		Reverse(arr,k,arr.length-1);
		Reverse(arr,0,arr.length-1);
	}
	
	static void Reverse(int arr[],int start,int end) {
		
		if(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
