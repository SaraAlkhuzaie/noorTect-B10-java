package day23.homework;

public class Exercise4 {

	public static void main(String[] args) {
		Exercise4 obj = new Exercise4();

		String r1 = obj.toUpper("Pro");
		String r2 = obj.toUpper("java");
		String r3 = obj.toUpper("java training");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
 		
	}

	String toUpper(String strOne) {
		String result = "";
		result = strOne.toUpperCase();

		return result;

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
 * ----------------------------------------------------------------------------------------------------------------
 * 4. Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 * 
 * Access Modifier: default Non-Access Modifier: non-static Return Type: String
 * Method Name: toUpper Parameter1:
 *  String strOne Test Data: toUpper (“Pro”)
 * ----- 
 * PRO toUpper (“java”) ----- LEARNING
 *  toUpper (“java training”) -----JAVA TRAINING
 */