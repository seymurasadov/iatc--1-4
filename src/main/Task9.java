package main;

public class Task9 {

	public static void main(String[] args) {
		String name = "Teymur";
		//rTeymu  -> 5 0 1 2 3 4
		//urTeym ->  4 5 0 1 2 3
		//murTey ->  3 4 5 0 1 2
		//ymurTe ->  2 3 4 5 0 1
		//eymurT ->  1 2 3 4 5 0
		//Teymur ->  0 1 2 3 4 5
		
		for(int i = 0; i < name.length(); i++) {
			String rigth = name.substring(name.length() - 1 - i);
			String left = name.substring(0, name.length() - 1 - i);
			System.out.println(rigth+left);
		}
	}
}
