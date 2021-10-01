package main;

public class Task4 {

	public static void main(String[] args) {
		int input = 754609;
		
		// 75469 % 10 = 9
		// 7546 % 10 = 6
		
		int tmp = input;
		
//		for(int i = 0; tmp % 10 == 0; i++) {
//			
//		}
		
		String result = "";
		
		while(tmp != 0) {
			int carry = tmp % 10;
			result = carry + result;
			tmp = tmp / 10;
		}
		
		System.out.println(result);
		
	}
	
}
