package cdac;

public class P16 {
   //16. Write a java program to Rotate the Given Arrayd times. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {1,2,3,4,5};
  for(int i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
  }
  System.out.println();
  rotate(arr,3);
  for(int i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
  }
	}
	
	static void rotate(int arr[],int d) {
		d=d%arr.length;
		if(d<0) {
			d=d+arr.length;
		}
		
		for(int i=1;i<=d;i++) {
			rotateOne(arr);
		}
	}
	static void rotateOne(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}

}
