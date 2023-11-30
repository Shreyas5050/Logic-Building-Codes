package cdac;

public class P5 {

	public static void main(String[] args) {
		// Write a Java Program to print all the Prime Factors of the Given Number. 
  int num=90;
  primeFactor(num);
  //System.out.println(Math.sqrt(num));
	}

	private static void primeFactor(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=num;i++) {
			if(isprime(i)==1) {
				int  x=num;
				while(x%i==0) {
					System.out.print(i+ " ");
					x=x/i;
				}
			}
		}
		
	}
	
	public static int isprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}

}
