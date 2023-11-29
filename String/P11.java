package cdac;

public class P11 {

	public static void main(String[] args) {
		// 11. Write a Java Program to Print All Permutations of a given String. [Solution]

		String str="abc";
		Permutation(str," ");
	}
	
	static void Permutation(String str,String ans) {
		int Len=str.length();
		
		if(str.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0;i<Len;i++) {
			char ch=str.charAt(i);
			
			String r=str.substring(0,i)+str.substring(i+1);
			Permutation(r,ch+ans);
		}
	}

}
