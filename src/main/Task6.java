package main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int firstNumber = scanner.nextInt();
		
		String first = "";
		
		int tmp = firstNumber;

		for(int i = 2; i <= tmp;) {
			if(tmp % i == 0) {
				first += " "+i;
				tmp = tmp / i;
				i = 2;
			}else {
				i++;
			}
		}
		
		System.out.println(first);
		
	}
}
