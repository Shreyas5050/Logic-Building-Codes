package cdac;

public class P10 {

	public static void main(String[] args) {
		// 10. Find sum of each row and each column of the Matrix. [Solution]

		int x=1;
		int arr[][]=new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=x++;
			
			}
			
		}
		
		rowsum(arr);
		columnsum(arr);
		
	}
	static void columnsum(int arr[][]) {
		int sum=0;
		System.out.println("ColumnSum==>");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum=sum+arr[j][i];
			}
			System.out.println("Sum of column "+i+" is ="+sum);
			sum=0;
		}
	}
	
	static void rowsum(int arr[][]) {
		System.out.println("Row Sum==>");
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println("Sum of Row "+i+" is = "+sum);
			sum=0;
		}
	}

}
