package cdac;

public class P1 {

	public static void main(String[] args) {
		// 1. Write a Java Program to Add two Matrices.[Solution]

		System.out.println("Array1");
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		PrintArray(arr1);
		System.out.println("Array2");
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		PrintArray(arr2);
		int size=3;
		int c[][]=sum(arr1,arr2,size);
 		System.out.println("Sum==>");
        PrintArray(c);		

	}
	
	static void PrintArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
		
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] sum(int arr1[][],int arr2[][],int size){
		
		int c[][]=new int [size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				c[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		
		
		
		return c;
	}

}
