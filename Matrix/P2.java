package cdac;

public class P2 {

	public static void main(String[] args) {
	//	2. Write a Java Program to Subtract Two Matrices. [Solution]
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	int b[][]= {
			{1,2,3},
			{1,2,3},
			{1,2,3}
	};
	int c[][]=Sub(a,b,3);
	printArray(c);
	}
	static void printArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] Sub(int a[][],int b[][],int n) {
		int ans[][]=new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans[i][j]=a[i][j]-b[i][j];
			}
		}
		return ans;
		
	}

}
