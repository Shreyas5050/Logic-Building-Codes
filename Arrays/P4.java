package cdac;

public class P4 {
//4. Find the missing Number in the given array of 1 to N.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,7};
		int n= arr.length;
		
		System.out.println("Missing Number=="+getmissingNumber1(arr,n));
		
		}
	
	static int getmissingNumber(int arr[],int n) {
		
		 int sum =((n+1)*(n+2))/2;
		 for(int i=0;i<arr.length;i++) {
			 sum=sum-arr[i];
		 }
		return sum ;
	}
	
	static int getmissingNumber1(int arr[],int n) {
		int ans=0;
		
		int temp[]=new int [n+1];
		for(int i=0;i<n;i++) {
			temp[i]=0;
		}
		 
		for(int i=0;i<n;i++) {
			temp[arr[i]-1]=1;
		}
		
		for(int i=0;i<n;i++) {
			if(temp[i]==0) {
				ans=i+1;
			}
		}
		return ans;
	}

}
