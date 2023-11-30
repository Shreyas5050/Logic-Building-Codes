package cdac;

public class P1 {

	public static void main(String[] args) {
		//  Write a Java Program to find GCD/HCF of two given numbers.
 int num1=10;
 int num2=20;
 int hcf=0;
 for(int i=1;i<=num1 || i<=num2;i++) {
	 if(num1%i==0 && num2%i==0) {
		 hcf=i;
		
	 }
 }
 System.out.println("HCF of two numbers=="+hcf);
	}

}
