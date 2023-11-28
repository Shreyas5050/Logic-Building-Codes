package cdac;

public class P6 {
  //6. Write a Java Program to find the Intersection of Two Sortedarrays. [Solution]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[] = { 1, 2, 4, 5, 6 };
	     int arr2[] = { 2, 3, 5, 7 };
	     int m=arr1.length;
	     int n=arr2.length;
	     
	     intersection(arr1,arr2,m,n);
	        
	}
	
	static void intersection(int arr1[],int arr2[],int m,int n) {
		int i=0;int j=0;
		System.out.println("Intersection");
		while(i<m && j<n) {
			if(arr1[i]>arr2[j]) {
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
	}

}
