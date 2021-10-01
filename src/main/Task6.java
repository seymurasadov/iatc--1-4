package main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char first = name.charAt(0);
		
		if(!Character.isDigit(first) && !Character.isLetter(first)) {
			System.out.println("OK");
		}else {
			System.out.println("ERROR");
		}
	}
}
