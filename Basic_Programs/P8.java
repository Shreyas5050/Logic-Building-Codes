package Cdac;

public class P8 {

	public static void main(String[] args) {
		// Write a Java Program to find whether given number is Leap year or NOT? 
     
		
		int year=1996;
		
	boolean result=Leap(year);
	if(result) {
		System.out.println("Year ="+year+" IS Leap Year");
	}
	else {
		System.out.println("Year ="+year+ " Is not a Leap Year");
	}
	}
	public static boolean Leap(int year) {
		
		if((year%4==0)&&(year%100!=0 || year%400==0)){
			return true;
		}
		else {
			return false;
		}
	}

}
