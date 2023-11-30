package cdac;

public class P8 {

	public static void main(String[] args) {
		// 8.Write a Java Program to check whether the given number is Armstrong Numberor NOT.
       int num=407;
       int len;
       len=order(num);
     //  System.out.println(len);
       if(Armstrong(num,len)) {
    	   System.out.println(num+" is an Armstrong number");
       }
       else {
    	   System.out.println(num+" is not an Armstrong number");
       }
	}
	
	static int order(int n) {
		int len=0;
		while(n!=0) {
			int temp=n%10;
			len++;
			n=n/10;
		}
		return len;
	}
	
	static boolean Armstrong(int Num,int len) {
		int temp,digit=Num;
		int sum=0;
		while(Num>0) {
			temp=Num%10;
			sum+= Math.pow(temp, len);
			Num=Num/10;
		}
	//	System.out.println(sum);
		return digit==sum;
	}

}
