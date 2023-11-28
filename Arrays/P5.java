package cdac;

import java.util.HashSet;
import java.util.Set;

public class P5 {
  //5. Write a Java Program to find the Intersection of two arrays.[Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr1[] = { 7, 1, 5, 2, 3, 6 };
	     int arr2[] = { 3, 8, 6, 20, 7 };
	     
	     int m=arr1.length;
	     int n=arr2.length;
	     
	     getintersection(arr1,m,arr2,n );
	}
	
	static void getintersection(int arr1[],int M,int arr2[],int N) {
		
		Set<Integer> s =new HashSet<Integer>();
		
		for(int i=0;i<M;i++) {
			s.add(arr1[i]);
		}
		System.out.println("Intersection");
		
		for(int i=0;i<N;i++) {
			if(s.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
	}

}
