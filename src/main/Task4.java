package main;

import java.util.Scanner;

public class Task4 {

	//49.Daxil olunmuş ədədi tərsinə çevirən proqramı yazın.
	public static void main(String[] args) {
		
		//-> 78912
		//<- 21987
		
		int number = new Scanner(System.in).nextInt();
		
		String numberStr = String.valueOf(number);
		
		//start length -1
		//end 0
		//index --
		
		String result = "";
		
		for(int i = numberStr.length()-1; i >= 0; i--) {
			 result += ""+numberStr.charAt(i);
		}
		
		System.out.println(result);
		
	}
}
