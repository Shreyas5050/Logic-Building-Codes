package cdac;

public class P8 {
 //8. Write a Java Program to find the Union of Two Arrays (Sorted Arrays). [Solution]s
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 5, 7};  
        int[] arr2 = {2, 4, 6, 8};  
        
        int m=arr1.length;
        int n=arr2.length;
        
        GetUnion(arr1,arr2,m,n);

	}
	
	static void GetUnion(int arr1[],int arr2[],int m,int n) {
		int i=0;int j=0;
		while(i<m  && j<n) {
			
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i++]+" ");
			}
			else	if(arr1[i]>arr2[j]) {
				System.out.print(arr2[j++]+" ");
			}
			else {
				System.out.print(arr1[i++]);
				j++;
			}
		}
		while(i<m) {
			System.out.print(arr1[i++]+" ");
		}
		while(j<n) {
			System.out.print(arr2[j++]+" ");
		}
		
	}

}
