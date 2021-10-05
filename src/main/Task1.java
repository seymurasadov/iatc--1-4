package main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Input Metn -> nextLine
		//Sozlerin sayini tapmaq
		// , . space !
		//Men bakida yasayiram.
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		int wordCount = 0;
		
		String word = "";
		String symbols = ".,! ";
		
		String words = "";
		
		for(int index = 0; index < text.length(); index++) {
			
			char charAt = text.charAt(index);
			
			if(Character.isLetter(charAt)) {
				word = word + charAt;
				if(index == text.length() - 1) {
					wordCount++;
					words += word+" ";
				}
			}else if(symbols.contains(""+charAt)) {
				if(!word.isEmpty()) {
					wordCount++;
					words += word+" ";
				}
				word = "";
			}
		}
		
		System.out.println(wordCount);
		System.out.println(words);
		
	}
}
