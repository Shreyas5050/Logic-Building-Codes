package cdac;

public class P11 {

	public static void main(String[] args) {
		//Write a Java Program to print Perfect Numbersbetween 1 to 1000.

		
		int temp;
		
		for(int i=1;i<1000;i++) {
			 
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}
	}

}
