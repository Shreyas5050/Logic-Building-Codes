package cdac;

public class P36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(j<=5-i) {
					System.out.print(" "+" ");
					continue;
				}
				else{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

}


//        1
//      2 2
//    3 3 3
//  4 4 4 4
//5 5 5 5 5