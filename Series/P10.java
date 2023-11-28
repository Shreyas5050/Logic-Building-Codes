 package cdac;

public class P10 {

	public static void main(String[] args) {
		// 10. Write the Java Program to print the following series Prime Number Series[Solution]

//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 .....

		int N=60;
		Prime(N);
	}
	static void Prime(int num) {
		 boolean flag;
		 System.out.println("Prime Numbers ==");
		for(int i=1;i<=num;i++) {
			
			if((i==1)||(i==0)){
				continue;
			}
			flag=true;
			
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			
			if(flag)
			System.out.print(i+" ");
		}
	}

}
