package cdac;

public class P9 {

	public static void main(String[] args) {
		// 9. Write the Java Program to print the following series Fibonacci Series[Solution]

//1 1 2 3 5 8 13 21 34 55 89 .....

		
		int i=1;
		int temp=0;
		int a=1,b=1;
		System.out.println("Fibonacci Series==>");
		System.out.print(a+ " , "+b+" , ");
		
		while(i<=10) {
		
			
			a=a+b;
			b=a-b;
			
			System.out.print(a+" , ");
			i++;
			
		}
	}

}
