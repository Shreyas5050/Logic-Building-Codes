package cdac;

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int s=1;
		for(int i=0;i<=5;i++) {
			
			for(int j=5;j>=1;j--) {
				if(j>=i) {
					System.out.print(" "+" ");
				}
				else {
				System.out.print((j+i)+" ");
				}
			}
			for(int k=0;k<i;k++) {
			s=i;
			
				System.out.print(s-k+" ");
			s=s-1;	
			}
			System.out.println();
		}
	}

}
//        1
//      3 2 1
//    5 4 3 2 1
//  7 6 5 4 3 2 1
//9 8 7 6 5 4 3 2 1