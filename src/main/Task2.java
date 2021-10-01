package main;

public class Task2 {

	public static void main(String[] args) {
		//input 1 - 1000 eded
		// 313  414 909
		
		for(int i = 1; i <= 100000; i++) {
			String value = String.valueOf(i);

			char first = value.charAt(0);
			char last = value.charAt(value.length() - 1);
			
			//12561
			if(first == last) {
				
				boolean equals = false;
				
				for(int j = 1; j < value.length() - 1; j++) {
					
					char middle = value.charAt(j);
					if(middle == first) {
						equals = true;
						break;
					}
					
				}
				
				if(!equals) {
					System.out.println(value);
				}
				
			}
			

			
		}
	}
	
}
