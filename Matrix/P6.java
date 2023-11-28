package cdac;

public class P6 {

	public static void main(String[] args) {
		// 6. Write a Java Program to check whether a Given Matrix is an Identity Matrix.[Solution]

		
		int arr[][]= {
				{1,0,0,0},
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1}
		};
		int N=4;
		if(isIdentify(arr,N)) {
			System.out.println("Yes-Identity Matrix");
		}
		else {
			System.out.println("No-Identity Matrix");
		}
	}
	
	static boolean isIdentify(int arr[][],int N) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==j && arr[i][j]!=1) {
					return false;
				}
				else if(i!=j && arr[i][j]!=0 ) {
					return false;
				}
			}
	
			
		}
		return true;
	}

}
