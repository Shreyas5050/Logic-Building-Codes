package cdac;

public class P2 {

	public static void main(String[] args) {
		// 2. Binary Search [Solution]
       int arr[]= {2,3,4,10,50};
       int a=arr.length;
       int key=10;
       int res=BinarySearch(arr,key);
       if(res==-1) {
    	   System.out.println("Element is not found in  array");
       }
       else {
    	   System.out.println("Element is found in array at index=="+res);
       }
	}
	
	static int BinarySearch(int arr[],int key) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			
			if(arr[m]==key) {
				return m;
				
			}
			if(arr[m]<key) {
				l=m+1;
			}
			else {
				r=m-1;
				
			}
		}
		
		return -1;
	}

}
