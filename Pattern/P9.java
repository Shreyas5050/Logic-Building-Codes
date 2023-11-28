package cdac;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=6;i>=1;i--) {
			for(int j=6;j>=i;j--) {
				System.out.print((j-i+1)+" ");
			}
			System.out.println();
		}
	}

}
//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1 
//6 5 4 3 2 1