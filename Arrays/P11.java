package cdac;

public class P11 {
  // 11. Write a Java Program to Move all Zeros to Start of the Array. [Solution]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {10,20,0,5,0,23,0};
 int n=arr.length;
 int count=n-1;
 int temp=0;
          for(int i=n-1;i>=0;i--) {
            if(arr[i]!=0) {
            arr[count--]=arr[i];	
            
            }
          }
          while(count>=0) {
        	  arr[count--]=0;
          }
      
          
          for(int i=0;i<n;i++) {
        	  System.out.print(arr[i]+ " ");
          }
	}

}
