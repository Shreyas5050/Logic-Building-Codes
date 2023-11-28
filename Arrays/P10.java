package cdac;

public class P10 {
  //10. Write a Java Program to Move all Zero to End of the Array. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,0,40,0,12,0};
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
			
		}
		while(count<n) {
			a[count++]=0;
		}
		System.out.println(" Zero at last of Array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
