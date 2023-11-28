package cdac;

public class P12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {10,20,30,40,50};
   int n= arr.length;
   
   System.out.println("Original ArraY");
   for(int i=0;i<n;i++) {
	   System.out.print(arr[i]+ " ");
   }
  System.out.println();
   System.out.println("Reverse Array");
   ReverseArray(arr);
   for(int i=0;i<n;i++) {
	   System.out.print(arr[i]+ " ");
   }
   
	}
	
	static void ReverseArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	}

}
