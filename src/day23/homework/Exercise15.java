package day23.homework;

public class Exercise15 {
	public static void main(String[] args) {
		
		String r1=removeSpace("Java Training       ");

		String r2=removeSpace("         I like to practice        ");

		System.out.println(r1);
		System.out.println(r2);
		
	}
	
	
	
	
	public static String removeSpace(String strOne) {

		String result = "";
		result = strOne.trim();

		return result;
		
	
	
	
	}

}
