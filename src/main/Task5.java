package main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		String saitler = "aıoueəiüö";
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		String result = "";
		
		for(int i = 0; i < name.length(); i++) {
			String lowerCase = (""+name.charAt(i)).toLowerCase();
			
			if(saitler.contains(lowerCase)) {
				result = result + name.charAt(i);
			}
		}
		
		System.out.println(result);
	
	}
}
