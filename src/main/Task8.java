package main;

public class Task8 {

	public static void main(String[] args) {
		
		int input = 954736841;
		//7
		
		//ikinci en boyuk reqemi
		
		String value = String.valueOf(input);
		
		int max = 0;
		int secondMax = 0;
		
		for(int i = 0; i < value.length(); i++) {
			
			char c = value.charAt(i);
			int val = Integer.parseInt(""+c);
			
			if(val > secondMax && val > max) {
				secondMax = max;
				max = val;
			}else if(val > secondMax){
				if(val != max) {
					secondMax = val;					
				}

			}
		}
		
		System.out.println(max+" "+secondMax);
		
	}
	
}
