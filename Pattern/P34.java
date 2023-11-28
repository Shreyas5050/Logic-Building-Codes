package cdac;

public class P34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(char i='A';i<='E';i++) {
			
			for(char j='A';j<='E';j++) {
			
			    if (j <('E' - i + 'A')) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		}
	}

}



//        A
//      B B
//    C C C
//  D D D D
//E E E E E