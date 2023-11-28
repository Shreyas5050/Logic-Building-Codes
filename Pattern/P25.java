package cdac;

public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int h=1;
 
		for(int i=1;i<=9;i+=2,h++) {
			for(int j=4;j>=h;j--) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
//        1
//      3 3 3
//    5 5 5 5 5
//  7 7 7 7 7 7 7
//9 9 9 9 9 9 9 9 9