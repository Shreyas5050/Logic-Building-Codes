package cdac;

public class P31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		for(int i=5;i>=1;i--) {
			
			for(int j=5;j>i;j--) {
				System.out.print(" "+" ");
			}
			
			for(int k=5;k>5-i;k--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}

//5 5 5 5 5
//  4 4 4 4
//    3 3 3
//      2 2
//        1