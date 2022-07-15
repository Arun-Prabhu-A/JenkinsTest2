package org.anagram;

public class Anagram {

	public static void main(String[] args) {
		String name1="listea";
		String name2 ="silent";
		int count=0;
		if(name1.length()==name2.length()) {
			for (int i = 0; i < name1.length(); i++) {
				for (int j = 0; j < name2.length(); j++) {
					if((name1.charAt(i))==(name2.charAt(j))) {
						System.out.println(name1.charAt(i)+"\t"+name2.charAt(j));
						count+=1;
						break;
					}
				}
			}
		}
		if(count==name1.length()){
			System.out.println("The words are anagrams");
		}
		else {
			System.out.println("The words are not anagrams");
		}
	}
}
