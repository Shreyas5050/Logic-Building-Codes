package cdac;

import java.util.HashMap;
import java.util.Map;

public class P17 {

	public static void main(String[] args) {
	//	17. Find the pair of elements(X+Y) in the array whose sum is equal to given number Z. [Solution]
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target=10;
		FindPair1(nums,target);
		
		
	
		}
	
	static void Findpair(int arr[],int tar) {
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==10) {
					System.out.print("Found Pair==>");
					System.out.print(arr[i]+" , "+ arr[j]+"  ");
				}
			
			}
		}

	}
	static void FindPair1(int arr[],int target) {
		Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(mp.containsKey(target-arr[i])) {
				System.out.print("Pair Found:"+arr[mp.get(target-arr[i])]+","+arr[i]+"  ");
			}
			mp.put(arr[i], i);
		}
	}

}
