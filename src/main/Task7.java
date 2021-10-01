package main;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		
		while(true) {
			
			System.out.println("Ad daxil edin -> ");
			name = scanner.next();
			char first = name.charAt(0);

			if(!Character.isDigit(first) && !Character.isLetter(first)) {
				System.out.println("OK");
				break;
			}else {
				System.out.println("ERROR -> yeniden daxil edin");
				continue;
			}
		}
		
		System.out.println("Ugurlu "+name);
		
	}
}
