package main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		//input
		//start number ->
		//end number <-
		// only /7
		//sum
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int startNumber = sc.nextInt();
		
		System.out.println("Enter Second number");
		int endNumber = sc.nextInt();
		
		int sum = 0;
		
		for(int i = startNumber; i <= endNumber; i++) {
			if(i % 7 == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
	//EKOB
	// 10   8
	// 2 5    2 4
}
