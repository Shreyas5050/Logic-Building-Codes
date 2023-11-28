package cdac;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 2, 3, 4, 5, 5, 6 };
        int b[] = { 3, 3, 5 };
        
        int m=a.length;
        int n=b.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        intersection(a,b,m,n);
	}
	
	static void intersection(int a[],int b[],int m,int n) {
		
		int i=0;int j=0;
		
		while(i<m && j<n) {
			
			if(a[i]>b[j]) {
				j++;
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
	}

}
