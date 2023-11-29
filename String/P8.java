package cdac;

public class P8 {

	public static void main(String[] args) {
		// 8. Write a Java program to find the Most Repeated Characterin the Given String. [Solution]
 
  String str="Sample String";
 System.out.println("Most repeated character in a given String="+generaterep(str));
  
 
	}
	
	static char generaterep(String str) {
		 final int ASCII =256;
		 int N=str.length();
		  int count[]=new int [256];
		  for(int i=0;i<N;i++) {
			  count[str.charAt(i)]++;
		  }
			  int max=-1;
			  char Result= ' ';
			  for(int i=0;i<N;i++) {
				  if(max<count[str.charAt(i)]) {
					  max=count[str.charAt(i)];
					  Result=str.charAt(i);
			  }
				  
				  
				  
			  
		  }
//			  for(int i=0;i<256;i++) {
//				if(count[i]!=0) {
//					System.out.println((char)i+" = "+count[i]+" ");
//				}
//			  }
//			  
			  return Result;
	}

}
