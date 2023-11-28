package cdac;

public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" "+" ");
			}
			
			for(int k=1;k<=6-i;k++) {
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
	}
}






//1 2 3 4 5
//  1 2 3 4
//    1 2 3
//      1 2
//        1
