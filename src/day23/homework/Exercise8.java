package day23.homework;

public class Exercise8 {

	public static void main(String[] args) {

		char r1 = getCharacter("java training", 2);
		char r2 = getCharacter("java training", 5);
		char r3 = getCharacter("java training", 8);
		char r4 = getCharacter("java training", 22);

		char r5 = getCharacter("java", 4);

		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		if (indexNum >= strOne.length()) {
			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}

		return result;

	}

}
/**
8. Write a method that takes two parameters, 
	one String parameter and one integer parameter. 
	
	The method should return the character at the given 
			index within the String. 
			If the indexNum more than the length of String 
			then return ‘?’ mark
			
			
		Access Modifier: public
		Non-Access Modifier: static
		Return Type: char
		Method Name: getCharacter
		Parameter1: String strOne
		Parameter2: Int indexNum
		
		Test Data:
			getCharacter ("java training", 2) ----- v
			getCharacter ("java training", 5) ----- t
			getCharacter ("java training", 8) ----- i
			getCharacter ("java training", 22) ----- ?

*/