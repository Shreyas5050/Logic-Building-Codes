package cdac;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("0"+" ");
				}
				else {
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
	}

}
//1
//1 0
//1 0 1
//1 0 1 0
//1 0 1 0 1
//1 0 1 0 1 0