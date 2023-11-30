package cdac;

public class P10 {

	public static void main(String[] args) {
		//  Write a Java Program to check whether the given number is Perfect Numberor NOT.

		
		int num=28;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println(num+" is a perfect Number");
		}
		else {
			System.out.println(num+" is not a perfect Number");
		}
	}

}
