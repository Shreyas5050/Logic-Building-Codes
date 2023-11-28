package cdac;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		for(char i='A';i<='E';i++) {
			
			for(char j='A';j<i;j++) {
				System.out.print(" "+" ");
			}

         for(char k='A';k<=((char)(('E'-i)+'A'));k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}

}


//A B C D E
//  A B C D
//    A B C
//      A B
//        A