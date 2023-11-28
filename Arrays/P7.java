package cdac;

import java.util.HashMap;
import java.util.Map;

public class P7 {
  //7. Write a Java Program to find the Union of Two Arrays (UnSorted Array). [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	     int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
	     
	     int m=a.length;
	     int n=b.length;
	     GetUnion(a,b,m,n);
	}
	static void GetUnion(int a[],int b[],int m,int n) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

    // Inserting array elements in mp
    for (int i = 0; i < m; i++) {
        mp.put(a[i], i);
    }
    for (int i = 0; i < n; i++) {
        mp.put(b[i], i);
    }

    System.out.println(
        "The union set of both arrays is :");
    for (Map.Entry mapElement : mp.entrySet()) {
        System.out.print(mapElement.getKey() + " ");
	}

	}
}

