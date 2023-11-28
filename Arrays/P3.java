package cdac;

public class P3 {
//3. Find the second minimum number in the given array. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-10,-20,-30,-40,-50,-60};
		
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secmin=min;
				min=arr[i];
			}
			else if(arr[i]>min && arr[i]<secmin) {
				secmin=arr[i];
			}
		}
		
		System.out.println("Min="+min);
		System.out.println("SecondMin="+secmin);
	}

}
