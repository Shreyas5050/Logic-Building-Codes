package cdac;

public class P2 {
  //2. Find the second largest number in the given array. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-120,-42,-80,-530,-240,-10};
		
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 secmax=max;
				 max=arr[i];
			 }
			 else if(arr[i]<max && arr[i]>secmax) {
				 secmax=arr[i];
			 }
		 }
		 System.out.println("Max="+max);
		 System.out.print("SecondMax="+secmax);

	}

}
