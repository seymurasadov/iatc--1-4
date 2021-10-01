package main;

public class Task3 {

	public static void main(String[] args) {
		
		//67
		//756
		
		for(int i = 1; i <= 1000; i++) {
			String value = String.valueOf(i);
			
			//756
			
			int result = 1;
			for(int j = 0; j < value.length(); j++) {
				
				//7
				char charAtIndex = value.charAt(j);
				
				if(charAtIndex != '0') {
					int intValue = Integer.parseInt(""+charAtIndex);
					result = result * intValue;
				}
			}
			
			System.out.println(result);
		}
	}
}
