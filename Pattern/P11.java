package cdac;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("1"+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}
//1 1 1 1 1 1
//1 1 1 1 2 2
//1 1 1 3 3 3
//1 1 4 4 4 4
//1 5 5 5 5 5
//6 6 6 6 6 6