package cdac;

public class P4 {

	public static void main(String[] args) {
		// 4. Write a Java Program to Multiply Two Matrices.[Solution]

		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int c[][]=new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j] * b[i][j];
			}
		}
		System.out.println("Multiplication Of Matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
		   System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		
			}
	}

