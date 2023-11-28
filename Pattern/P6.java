package cdac;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
		
		
		for(int k=1;k<i;k++) {
			System.out.print(i-k+" ");
		}
		System.out.println();
		}
	}

}
//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
//1 2 3 4 5 6 5 4 3 2 1 