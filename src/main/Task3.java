package main;

import java.util.Scanner;

public class Task3 {

	
	//Eded factorialini hesablamag
	// !6
	// start input
	// end 2
	//index --
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int result = 1;
		
		for(int i = number; i >= 2; i--) {
			result *= i;
		}
		
		System.out.println(result);
	}
}
