package cdac;

import java.util.HashSet;
import java.util.Set;

public class P9 {
  //9. Write a Java Program to find the Union of Two Arrays (UnSorted Array). [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	     int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
	     
	     int m=a.length;
	     int n=b.length;
	     GetUnion(a,b,m,n);
	}
	
	static void GetUnion(int a[],int b[],int m,int n) {
		Set< Integer> s= new HashSet<Integer>();
		
		for(int i=0;i<m;i++) {
			s.add(a[i]);
		}
		
		for(int j=0;j<n;j++) {
			s.add(b[j]);
		}
		
		System.out.println("Size of Union=="+s.size());
		System.out.print("Union ====>");
		System.out.print(s.toString());
	}

}
