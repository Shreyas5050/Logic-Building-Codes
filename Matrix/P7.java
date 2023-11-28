package cdac;

public class P7 {

	public static void main(String[] args) {
		// 7. Check whether the Given Matrix is Sparse Matrix or NOT[Solution]
int arr [][]= {
		{1,0,0},
		{1,2,0},
		{0,0,5}
};

int m=3;
if(checksparse(arr,m)) {
System.out.println("Yes-Sparse Matrix");
}
else {
	System.out.println("No");
}
	}
	
	static boolean checksparse(int arr[][],int N) {
		int counter=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j< N;j++) {
				if(arr[i][j]==0) {
					counter++;
				}
			}
		}
		return (counter > (N*N)/2);
	}

}
