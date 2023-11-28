package cdac;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=9;
		for(int i=9;i>=1;i-=2,a--) {
			 
			for(int k=9;k>=a;k--) {
				
				System.out.print(" "+" ");
			}
			

			for(int j=1;j<=i;j++) {
			    
			
				System.out.print(i+" ");
			
			}
			System.out.println();
		}
	}

}
//9 9 9 9 9 9 9 9 9
//  7 7 7 7 7 7 7
//    5 5 5 5 5
//      3 3 3
//        1