package day23.homework;

public class Exercise1 {

	public static void main(String[] args) {
		boolean r1=isEqual("sdet", "SDET");
		boolean r2=isEqual("testing", "testing");
		boolean r3=isEqual("java", "java");
		boolean r4=isEqual("java", "java Programming");
		
	}

	static boolean isEqual(String strOne, String strTwo) {
		boolean result = false;
		if (strOne.equals(strTwo)) {
			result = true;
		}

		return result;
	}

}

/**
 * 1. Write a method that takes two String parameter and checks if the two
 * strings are equal
 * 
 *
 * or not. If they are equal return true, otherwise return false
 * 
 * Access Modifier: Default
 * 
 * Non-Access Modifier: static
 * 
 * Return Type: boolean
 * 
 * Method Name: isEqual
 * 
 * Parameter1: String strOne
 * 
 * Parameter2: String strTwo
 * 
 * Test Data:
 * 
 * isEqual (“sdet”, “SDET”) ----- FALSE 
 * isEqual (“testing”, “testing”) -----
 * TRUE
 *  isEqual (“java”, “java”) ----- TRUE 
 *  isEqual (“java”, “java Programming”)
 * ----- FALSE
 */