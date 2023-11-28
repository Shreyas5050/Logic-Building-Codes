package cdac;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" "+" ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(k+" ");
			}
			for(int j=5;j>i;j--) {
				System.out.print((j-i)+" ");
			}
			System.out.println();
		}
		
	}

}

//        1
//      1 2 1
//    1 2 3 2 1
//  1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
