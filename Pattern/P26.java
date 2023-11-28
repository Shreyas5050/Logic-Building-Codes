package cdac;

public class P26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=9;
		for(int i=1;i<=5;i++,a--) {
			for(int j=4;j>=i;j--) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=i;j++) {
			
				System.out.print(i+" ");
			}
			for(int j=9;j>a;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
//        1
//      2 2 2
//    3 3 3 3 3
//  4 4 4 4 4 4 4
//5 5 5 5 5 5 5 5 5