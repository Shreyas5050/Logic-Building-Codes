package cdac;

public class P9 {

	public static void main(String[] args) {
		// 9. Display the Upper Triangular Matrix[Solution]
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
			   if(j<i) {
				   arr[i][j]=0;
				   System.out.print(arr[i][j]+" ");
			   }
			   else {
				   System.out.print(arr[i][j]+" ");
			   }
			}
			System.out.println();
		}

	}

}
