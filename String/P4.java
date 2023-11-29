package cdac;

public class P4 {

	public static void main(String[] args) {
		// 4. Write a java program to Count the Number of Wordsin a given String. [Solution]

		   String sentence = "Beauty and the Beast";
		  int wordcount=0;
		  
		  for(int i=0;i<sentence.length()-1;i++) {
			  
			  if(sentence.charAt(i)==' '   &&  Character.isLetter(sentence.charAt(i+1)) && (i>0) ) {
				  wordcount++;
				  
			  }
		  }
		  wordcount++;
		  System.out.println("Number of words in the given Sentence="+wordcount);
		  
	}

}
