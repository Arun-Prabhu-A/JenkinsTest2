package org.anagram;

public class Pangram {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		int count=0;
		sentence = sentence.toLowerCase();
		sentence=sentence.trim();
		char[] sentenceArray=sentence.toCharArray();
		for (int i = 97; i < 123; i++) {
			for (int j = 0; j < sentenceArray.length; j++) {
				int k=sentenceArray[j];
				if(k==i) {
					System.out.println(k+"\t"+i);
					count+=1;
				}
			}
		}
		if(count==26)
			System.out.println("It's a pangram");
		else
			System.out.println("It's not a pangram");
	}

}
