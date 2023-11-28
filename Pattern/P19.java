package cdac;

public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		for(int i=0;i<=4;i++) {
		    
			for(int k=5;k>=i;k--) {
				
				System.out.print(" "+" ");
			}
		
			for(int j=4;j>=1;j--) {
			
			if(i>=j)
					System.out.print((char)(j+i+'A')+" ");
				
				
			}
			for(int l=0;l<=i;l++) {
				
				System.out.print((char)('A'+i-l)+" ");
			}
			System.out.println();
		}
	}

}
//        A
//      C B A
//    E D C B A
//  G F E D C B A
//I H G F E D C B A