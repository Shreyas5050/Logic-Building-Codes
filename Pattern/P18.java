package cdac;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		for(int i=0;i<=4;i++) {
			
			for(int j=3;j>=i;j--) {
				System.out.print(" "+" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(i-k+1+" ");
			}
			for(int l=0;l<=i;l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	
	}

}

//
//        0 
//      1 0 1
//    2 1 0 1 2
//  3 2 1 0 1 2 3
//4 3 2 1 0 1 2 3 4