package cdac;

public class P2 {

	public static void main(String[] args) {
		// Write a java program to LCM of TWO given number.
		int a=20;
		int b=30;
		
		int lcm=0;
		int max=a>b?a:b;
	//	System.out.println(max);
		
		for(int i=max;i<=a*b;i++) {
			if(i%a==0  && i%b==0) {
				lcm=i;
				
				break;
			}
	
		}

		System.out.println("LCM of Two numbers ="+lcm);
	}

}
