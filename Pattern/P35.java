package cdac;

public class P35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}





//        1
//      1 2
//    1 2 3
//  1 2 3 4
//1 2 3 4 5
