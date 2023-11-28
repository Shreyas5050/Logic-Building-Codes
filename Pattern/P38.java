package cdac;

public class P38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		for(char i='A';i<='E';i++) {
			for(char j='E';j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	
	}

}



//E D C B A
//E D C B
//E D C
//E D
//E