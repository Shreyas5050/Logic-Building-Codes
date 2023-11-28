package cdac;

public class P13 {
	//13. Write a program to find the Most Frequent Elementin an given array. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 }; 
		int n=arr.length;
		System.out.println("Most Frequent Element-->");
		System.out.print(maxcount(arr,n));
	}
	static int maxcount(int arr[],int n) {
		int mostFreqElement=0;
		
	
		int maxcount=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostFreqElement=arr[i];
			}
		}
		
		
		return mostFreqElement;
		
	}

}
