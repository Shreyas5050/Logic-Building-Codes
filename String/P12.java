package cdac;

public class P12 {

	public static void main(String[] args) {
		// 12. Write a Java Program to find All Subsetsof a Given String using Bitwiseapproach. [Solution]
char []subset= {'a','b','c'};
printsubset(subset);

	}
	static void printsubset(char []a) {
		int n=a.length;
		for(int i=0;i<(1<<n);i++) {
			System.out.print("{");
			for(int j=0;j<n;j++) {
				if((i&(1<<j))>0) {
					System.out.print(a[j]+" ");
				}
			}
			System.out.println("}");
			
		}
	}

}
