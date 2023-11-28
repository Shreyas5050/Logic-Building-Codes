package cdac;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int p=0;
		
		for(char i='E';i>='A';i--) {
			char k='A';
			
		
			for(char j='A';j<'E';j++) {
				if(j<i) {
					System.out.print(" "+" ");
				}
				else {
				System.out.print(k+" ");
				k++;
				}
			}
			
			for(char l='A';l<='E'-i+'A';l++) {
				System.out.print((char)(l+p)+" ");
			}
			System.out.println();
			p++;
		}
	}

}


//        A
//      A B C
//    A B C D E
//  A B C D E F G
//A B C D E F G H I

