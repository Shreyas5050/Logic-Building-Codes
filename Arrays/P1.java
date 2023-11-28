package cdac;

public class P1 {
  //1. Calculate the average of given array. [Solution]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum=0;
    int avg=0;
		int arr[]=new int [5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("Average="+avg);
	}

}
