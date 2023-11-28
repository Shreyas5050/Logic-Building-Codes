package cdac;

public class P12 {
//12. Write a Java Program to Reverse the given array without using additional Array.[Solution]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {10,20,30,40,50};
  int n=arr.length;
   System.out.println("Reverse Array==>");
  for(int i=n-1;i>=0;i--) {
	  System.out.print(arr[i]+" ");
	  
  }
	}

}
