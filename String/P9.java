package cdac;

public class P9 {

	public static void main(String[] args) {
		// 9. How do you count the Number of Wordsin a given String using Split method? [Solution]

String str=" Java is a Programming Language";
str=str.trim();
//System.out.println(str);
String Words[]=str.split("\\s+");
int wordcount=Words.length;
System.out.println("Number of Words="+wordcount);
	}

}
