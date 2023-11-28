package Cdac;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Check the given number is EVEN or ODD.
		
		Scanner SC =new Scanner (System.in);
		System.out.println("Enter the number");
		int num=SC.nextInt();
	   
		if(num%2==0) {
			System.out.println(num+"  IS a Even Number");
		}
		else {
			System.out.println(num+"  Is a Odd Number");
		}
	}

}
