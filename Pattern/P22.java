package cdac;

public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>i;j--) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int l=1;l<i;l++) {
				
				x++;
				if(i>=l)
				System.out.print(l+i+" ");
				
			}
			System.out.println();
		}
	}

}
//        1
//      1 2 3
//    1 2 3 4 5
//  1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 9