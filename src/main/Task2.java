package main;

public class Task2 {

	public static void main(String[] args) {
		String first = "Men bas dusmurem";
		String second = "Basa duse bilmirem";
		
		String word = "";
		String symbols = ".,! ";
		String words = "";
		
		for(int index = 0; index < first.length(); index++) {
			
			char charAt = first.charAt(index);
			
			if(Character.isLetter(charAt)) {
				word = word + charAt;
				if(index == first.length() - 1 && second.toLowerCase().contains(word.toLowerCase())) {
						words+= word+" ";
				}
			}else if(symbols.contains(""+charAt)) {
				if(!word.isEmpty() && second.toLowerCase().contains(word.toLowerCase())) {
						words+= word+" ";
				}
				word = "";
			}
		}
		
		System.out.println(words);
		
	}
}
