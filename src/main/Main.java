package main;

public class Main {

	public static void main(String[] args) {

		String name = "Teymur";


		for (int i = 0; i < 3; i++) {
			String result = "";
			
			for(int j = 0; j < name.length(); j++) {
				char c =  (char) (name.charAt(j) + i);
				
				if(Character.isLetter(c)) {
					result += ""+c;
				}else {
					result += "a";
				}
			}
			
			System.out.println(result);

		}

	}
}
