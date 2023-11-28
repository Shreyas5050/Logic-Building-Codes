package cdac;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P15 {
//15. Write a program to find the Most Frequent Element using HashTable. [Solution]
	public static void main(String[] args) {
		
        int arr[] = {40,50,30,40,50,30,30}; 
        int n=arr.length;
        System.out.println("Most Frequent Element=="+(MostFreqElement(arr,n)));
		
	}
	
	static int MostFreqElement(int arr[],int n) {
		Map<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int key =arr[i];
			System.out.println(hp.containsKey(key));
			if(hp.containsKey(key)) {
				System.out.println(hp.get(key));
				int freq=hp.get(key);
				
				freq++;
				hp.put(key, freq);
			}
			else {
				hp.put(key, 1);
			}
		}
		int max_count=0;
		int res=-1;
		for(Entry<Integer,Integer> val:hp.entrySet()) {
			if(max_count<val.getValue()) {
				res=val.getKey();
				max_count=val.getValue();
			}
		}
		return res;
		
	}

}
