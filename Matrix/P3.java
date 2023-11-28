package cdac;

public class P3 {

	public static void main(String[] args) {
	//	3. Write a Java Program to Transpose a Matrix.[Solution]
 int a[][]= {
		 {1,2,3},
		 {4,5,6},
		 {7,8,9}
 };
 
 for(int i=0;i<a.length;i++) {
	 for(int j=i+1;j<a[i].length;j++) {
		 int temp=a[i][j];
		 a[i][j]=a[j][i];
		 a[j][i]=temp;
	 }
 }
 System.out.println("Transpose Matrix==");
 for(int i=0;i<a.length;i++) {
	 for(int j=0;j<a[i].length;j++) {
		 System.out.print(a[i][j]+" ");
	 }
	 System.out.println();
 }
	}

}
