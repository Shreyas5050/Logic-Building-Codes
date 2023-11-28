package cdac;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=6;j++) {
				if(j<=i)
				{
					if(i==1) {
						break;
					}
					System.out.print(j+" ");
				}
		
			}
			
			
if(i!=1)			
System.out.println();
		}
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2 
//1 
//1 2
//1 2 3 
//1 2 3 4 
//1 2 3 4 5
//1 2 3 4 5 6