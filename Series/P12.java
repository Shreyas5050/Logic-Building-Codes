package cdac;

public class P12 {

	public static void main(String[] args) {


//12. Write the Java Program to print the following series
//
//1 2 3 2 3 4 3 4 5 4 5 4 5 6 5 6 5 6 7 ....

	                
		 int rows = 5; // You can change the number of rows as per your requirement

	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            
	            // Inner loop for numbers in each row
	            for (int j = i; j < i + 3; j++) {
	                System.out.print(j + " ");
	            }

	        
	        }
	    }
	}


