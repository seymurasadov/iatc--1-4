package main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		//Ededin reqemlerinin ededi ortasi
		String number = new Scanner(System.in).next();
		
		int sum = 0;
		
		for(int i = 0; i < number.length(); i++) {
			char digit = number.charAt(i);
			sum += Integer.parseInt(""+digit);
		}
		
		System.out.println("Result ->");
		System.out.println(sum/(double)number.length());
		
	}
	
}
