package cdac;

public class P2 {

	public static void main(String[] args) {
		//2. How to Swap two Stringswithout using third (temporary) variable? [Solution]
     String a="Shreyas";
     String b="Shubham";
     
     System.out.println("Before Swapping=>A:"+a+" and B:"+b+" ");
     
     a=a+b;
System.out.println(a);
  
b=a.substring(0, a.length()-b.length());  // ShreyasShubham  14-7=7(0,7)==Shreyas=7
a=a.substring(b.length());  // ShreyasShubham 7=Start index== 7    Shubham

System.out.println("After  Swapping=>A:"+a+" and B:"+b+" "); 
	}

}
