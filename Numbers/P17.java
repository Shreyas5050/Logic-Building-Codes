package cdac;

import java.util.ArrayList;
import java.util.List;

public class P17 {

	public static void main(String[] args) {
		//  Write a Java Program to print Smith Numberbetween 2 to 1000.
		for (int n = 1; n < 1000; n++)   
		{  
		
		List<Integer> factors = findPrimeFactors(n);  
		//the size() method returns the number of elements in the list  
		//executes until the condition becomes false  
		if (factors.size() > 1)   
		{  
		int sum = sumOfDigits(n);  
		for (int f : factors)  
		sum =sum-sumOfDigits(f);  
		if (sum == 0)  
		System.out.print(n+ " ");  
		}  
	}

	}
	
	static List<Integer> findPrimeFactors(int n)   
	{  
	//creating an array list that stores the prime factors      
	List<Integer> result = new ArrayList<>();  
	for (int i = 2; n % i == 0; n = n/i)  
	result.add(i);  
	for (int i = 3; i * i <= n; i =i+2)   
	{  
	while (n % i == 0)   
	{  
	result.add(i);  
	n = n/i;  
	}  
	}  
	if (n != 1)  
	//the add() method adds the prime factors to the list  
	result.add(n);  
	return result;  
	}  
	static int sumOfDigits(int n)   
	{  
	int sum = 0;  
	while (n > 0)   
	{  
	//finds the last digit and add it to the sum      
	sum =sum+(n % 10);  
	//removes the last digit from the number  
	n = n/10;  
	}  
	//returns the sum of digits  
	return sum;  
	}  
	
	
	
	
}