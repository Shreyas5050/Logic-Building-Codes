package cdac;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
		for(int i=5;i>=1;i--) {
			
			for(int k=5;k>=i;k--) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<5;j++) {
				if(j<i)
			System.out.print(i+" ");
			}
			for(int j=1;j<=i;j++) {
			
				System.out.print(i+" ");
			}
			
		
			System.out.println();
		}
	}

}
//5 5 5 5 5 5 5 5 5
//  4 4 4 4 4 4 4
//    3 3 3 3 3
//      2 2 2
//        1