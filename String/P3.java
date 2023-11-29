package cdac;

public class P3 {

	public static void main(String[] args) {
		// 3. Write a java program to Reverse a Stringwithout using in-build function. 

		String s="Shreyas";
		String rev="";
		char ch;
		//1
		for(int i=0;i<=s.length()-1;i++) {
		 ch= s.charAt(i);
		 rev=ch+rev;
		}
		System.out.println("Reverse String="+rev);
		//2
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		//3
		char arr[]=s.toCharArray();
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
