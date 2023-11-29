package cdac;

import java.util.ArrayList;
import java.util.List;

public class P10 {

	public static void main(String[] args) {
		// 10. Write a Java Program to Print All Combinations of a given String. [Solution]
  
		String s="ABC";
		List<String> combinations= generatecombination(s);
		
		System.out.println("Combination of String : "+s+" is :: ");
		for(String cc : combinations) {
			System.out.println(cc);
		}
	}
	
	static List<String> generatecombination(String str){
		List<String> combination = new ArrayList<String>();
		backtrack("",str,combination);
		return combination;
	}
	
	private static void backtrack(String current,String remaining,List<String> combination) {
		if(remaining.length()==0) {
			combination.add(current);
			return;
		}
		
		backtrack(current+remaining.charAt(0),remaining.substring(1),combination);
		backtrack(current,remaining.substring(1),combination);
	}

}
