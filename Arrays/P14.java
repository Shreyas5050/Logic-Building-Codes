package cdac;

import java.util.Arrays;

public class P14 {
//14. Write a program to find the Most Frequent Element using Sorting. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	      int arr[] = { 40,50,30,40,50,30,30};
	      int n=arr.length;
	      System.out.println("Most frequent element==>"+mostfreq(arr,n));
	}
	
	static int mostfreq(int arr[],int n) {
		int res=arr[0];
		int maxcount=1;
		int curr_count=1;
		Arrays.sort(arr);
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				curr_count++;
			}
			else
				curr_count=1;
			if(curr_count>maxcount) {
				maxcount=curr_count;;
				res=arr[i-1];
			}
		}
		return res;
	}

}
