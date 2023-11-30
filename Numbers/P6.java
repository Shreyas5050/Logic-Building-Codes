package cdac;

public class P6 {

	public static void main(String[] args) {
		// Write a Java Program to check whether the Given Number is Prime Number or NOT
  int num=5;
  CheckPrime(num);
  
	}

	private static void CheckPrime(int num) {
		// TODO Auto-generated method stub
		int count=0;
		
		if(num<2) {
			System.out.println(num+" is not a prime number");
			System.exit(0);
		}
		for(int i=1;i<=num;i++) {
			if((num%i)==0) {
				count ++;
			}
		}
		if(count>2) {
			System.out.println(num+ " is not a prime number");
		}
		else {
			System.out.println(num+" Is a prime number");
		}
	}

}
