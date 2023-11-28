package cdac;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6;j++) {
				
				if(j<i) {
					System.out.print(" "+" ");
				}
				else {
					
					if(i==6 ) {
						break;
					}
					System.out.print(j+" ");
				}
			}
		  
			if(i!=6)
			System.out.println();
			
		}
		
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=6;j++) {
				if(j<i) {
					System.out.print(" "+" ");
				}
				else {
					
				System.out.print(j+" ");
			}
			}
			System.out.println();
		}
		
		
	}
	

}
//1 2 3 4 5 6
//  2 3 4 5 6
//    3 4 5 6
//      4 5 6
//        5 6
//	        6
//	      5 6
//      4 5 6
//    3 4 5 6
//  2 3 4 5 6
//1 2 3 4 5 6
