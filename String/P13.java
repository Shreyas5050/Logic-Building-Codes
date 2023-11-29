package cdac;

public class P13 {

	public static void main(String[] args) {
		// 13. Write a Java Program to find All Subsetsof a Given String using Recursionapproach. [Solution]

		 String str = "abc";
	        int index = -1;
	        String curr = "";
	        powerSet(str, index, curr);
	}
	static void powerSet(String str, int index, String curr)
    {
        int n = str.length();
 
        // base case
        if (index == n) {
            return;
        }
 
        // First print current subset
        System.out.println(curr);
 
        // Try appending remaining characters
        // to current subset
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            powerSet(str, i, curr);
 
            // Once all subsets beginning with
            // initial "curr" are printed, remove
            // last character to consider a different
            // prefix of subsets.
            curr = curr.substring(0, curr.length() - 1);
        }
    }

}
