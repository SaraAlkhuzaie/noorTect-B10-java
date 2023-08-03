package day23.homework;

public class Exercise3 {

	public static void main(String[] args) {
		
		isEqualLength("Pro","Ali");
		isEqualLength("java","LearNinG");
		isEqualLength("java training","java");
		
	}

	public static void isEqualLength(String strOne, String strTwo) {
		if (strOne.length() == strTwo.length()) {
			System.out.println(strOne.concat(strTwo) +" " +strOne.concat(strTwo).length());
		} else if (strOne.length() > strTwo.length()) {
			System.out.println(strOne.toUpperCase()+ "  " +strOne.length());

		} else {
			System.out.println(strTwo.toLowerCase()+ " " +strTwo.length());
			//or
			
			
			Object String;
			if( strOne.length() == strTwo.length()) {
				
				String newStr = strOne.concat(strTwo);
				int newStrLength = newStr.length();		
				
				System.out.println(newStr + " " + newStrLength);
				
				
			} else if ( strOne.length() > strTwo.length()) {
				
				String newStr = strOne.toUpperCase();
				int newStrLength = newStr.length();
				
				System.out.println(newStr + " " + newStrLength);
				
			} else {
				String newStr = strTwo.toLowerCase();
				int newStrLength = newStr.length();
				System.out.println(newStr + " " + newStrLength);
			}

		}

	}
}

/**
 * 3. Write a method that takes two String parameter and checks if the length of
 * parameter one equal to the length of parameter two. a. If they are equal,
 * then concatenate parameter 1 with parameter two and print the new string
 * value with its length b. If parameter 1 length is greater than parameter 2
 * then print parameter 1 all in uppercase with its length c. If parameter 1
 * length is less than parameter 2 then print parameter2 all in lowercase with
 * its length
 * 
 * Access Modifier: public Non-Access Modifier: static Return Type: void Method
 * Name: isEqualLength Parameter1: String strOne Parameter2: String strTwo Test
 * Data: isEqualLength (“Pro”, “Ali”) ----- ProAli 6 isEqualLength (“java”,
 * “LearNinG”) ----- learning 8 isEqualLength (“java training”, “java”) -----
 * JAVA TRAINING 13
 * 
 */