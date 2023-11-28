package cdac;

public class P7 {

	public static void main(String[] args) {
		// 7. Write the Java Program to print the following series Geometric Progression[Solution]

//1 2 4 8 16 32 64 128 256 512 1024 ......
		
		int i=1;
		int j=1;
		while(j<=11) {
			System.out.print(i+" ");
			i=i*2;
			j++;
		}

	}

}
