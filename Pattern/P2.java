package cdac;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		for(int i=0;i<7;i++) {
			
			for(int j=0;j<7-i-1;j++) {
				System.out.print(" ");
			}
			int val=1;
			for(int k=0;k<=i;k++) {
				System.out.print(val+" ");
				val=val*(i-k)/(k+1);
		
			}
			System.out.println();
		}
	}

}
//Pascal's triangle?
//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 
// 1 5 10 10 5 1 
//1 6 15 20 15 6 1 