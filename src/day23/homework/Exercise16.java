package day23.homework;

public class Exercise16 {
	public static void main(String[] args) {
		Exercise16 obj=new Exercise16();
		String r1= obj.concatString ("Java", "awesome");
		String r2= obj.concatString ("food", "door");
		String r3= obj.concatString ("java", "trining");
		String r4= obj.concatString ("pro", "ogress");
		 System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
	}
		
	
	
	
	
	
	
	
	
	//non-static						//awesome
	String concatString(String strOne, String strTwo) {
		String result = "";

		// Step 1. Find out the last character of strOne

		// a. what index position will give us the last index
		int lastCharacterIndexNum = strOne.length() - 1;

		// b. which method takes index num and returns the character in that position
		char str1LastCharacter = strOne.charAt(lastCharacterIndexNum);
		

		// Step 2. Find out the first character of strTwo

		// a. what index position will give us the first character
		// answer index ZERO

		char str2FirstCharacter = strTwo.charAt(0);

		// Step 3. check if the (step 1 & step 2 is eqwual)

		if (str1LastCharacter == str2FirstCharacter) {
			// equals --> it means duplicate and needs to be removed from one, then append
							
			String newStrTwo = strTwo.substring(1);
			
			
			result = strOne.concat(newStrTwo);

		} else {
			// not equal --> it means not duplciate just append without removing

			result = strOne.concat(strTwo);
		}

		return result;
	}

}
/**
 * 	 s1 = 	java 
 * 	s2 	= 	awesome
 * 
 * 		java+awesome = javaawesome
 * 
 * 
 * 	s1 = java  
 * s2 = training
 * 			java + training = javatraining 
 */



/**

16. Write a method to concatenate two given strings such that, 

	if the concatenation creates a double characters then removes one of the characters.
		a. For example strOne = “food”; strTwo =”door”. 

			After concatenating two strings it will give us 
		“fooddoor”(dd is double character, remove one of the d) 
				then the string after concatenation are: “foodoor”


	Access Modifier: default
	Non-Access Modifier: non-static
	Return Type: String
	Method Name: concatString
	Parameter1: String strOne
	Parameter2: String strTwo



	Test Data:
	
	
		concatString (“Java”, “awesome”) ----- javawesome
		concatString (“food”, “door”) ----- foodoor
		concatString (“java”, “training”) ----- javatraining
		concatString (“Pro”, “ogress”) ----- Progress
		*/
