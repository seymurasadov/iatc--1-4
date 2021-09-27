package main;

import java.util.Scanner;

public class Task1 {

	
	//12. Mətndə olan bütün bosluqlarin sayini tapan proqram yazin.
	// -> String input 
	//  " " find empty characters
	// and count it
	// text has first index 0
	//text has last index (length - 1)
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Metni daxil edin!");
		String text = scanner.nextLine();
		
		int counter = 0;
		
		for(int index = 0; index < text.length() - 1; index++) {
			
			char c = text.charAt(index);
			
			if((""+c).isBlank()) {
				counter++;
			}
		}
		
		System.out.println("Empty characters -> "+counter);
		
	}
}
