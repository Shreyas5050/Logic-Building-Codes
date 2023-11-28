package cdac;

public class P2Recursive {

	public static void main(String[] args) {
	int arr[]= {2,3,4,10,50};
	
	int l=0;
	int r=arr.length-1;
	int key=10;
	int res=BinarySearch(arr,l,r,key);
  
	if(res==-1) {
		System.out.println("Element is not found in an array");
	}
	else {
		System.out.println("Element is found in an array at index ="+res);
	}
	}
	
	static int BinarySearch(int arr[],int l,int r,int key) {
		
		while(l<=r) {
			int m=l+(r-l)/2;
			
			if(arr[m]==key) {
				return m;
			}
			if(arr[m]<key) {
				return BinarySearch(arr, m+1, r, key);
			}
			else {
				
				return BinarySearch(arr,l,m-1,key);
			}
		}
		
		return -1;
	}

}
