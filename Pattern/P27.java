package cdac;

public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" "+" ");
			}
		
			for(int j=1;j<=9;j++) {
				if(j<=i)
				System.out.print("*"+ " ");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
//        * 
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
