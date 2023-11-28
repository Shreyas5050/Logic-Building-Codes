package cdac;

public class P6 {

	public static void main(String[] args) {
		// 6. Write the Java Program to print the following series [Solution]

      //2 9 28 65 126 217 344
		int i=1;
		int temp;
		while(i<=10) {
			temp=(i*i*i)+1;
			System.out.print(temp+" ");
			i++;
		}

	}

}
