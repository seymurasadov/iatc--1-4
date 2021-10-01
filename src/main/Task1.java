package main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		
		String vuruqlar = "";
		
		//3 3 3 = 27
		//2 3 5 = 30
		int temp = firstNumber;
		
		for(int i = 2; i <= temp;) {
			if(temp % i == 0) {
				vuruqlar = vuruqlar +  i + " ";
				temp = temp / i;
				i = 2;
			}else {
				i++;
			}
		}
		
		System.out.println(firstNumber+" ededinin vuruqlari bunlardir "+vuruqlar);
				
	}
	
}
