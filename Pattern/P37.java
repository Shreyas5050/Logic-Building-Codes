package cdac;

public class P37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(j<=5-i) {
					System.out.print(" "+" ");
					continue;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
          
	}

}


//        *
//      * *
//    * * *
//  * * * *
//* * * * *