package day23.homework;

public class Exsercise2 {
	public static void main(String[] args) {
		Exsercise2 obj= new Exsercise2 ();
		boolean r1= obj.isThreeEqual("day" ,"DAY" , "DaY");
		boolean r2= obj.isThreeEqual("week" ,"weekend" , "monday");
		boolean r3= obj.isThreeEqual("java" ,"JAVa" , "jaVa");
		boolean r4= obj.isThreeEqual("javaProgramming" ,"java Programming" , "Programming in Java");
		System.out.println(r1);
		System.out.println(r2);

		System.out.println(r3);

		System.out.println(r4);

		
	}


//non static

protected boolean isThreeEqual(String strOne,String strTwo,String strThree) {
	boolean result= false;
	if (strOne .equalsIgnoreCase( strTwo)&&strOne .equalsIgnoreCase( strThree)&& strTwo .equalsIgnoreCase (strThree)  ) {
		result = true;
		
	}
	return result;
	
}

}

/**
2. Write a method that takes three String parameter and checks if the three strings are
equal or not ignore the case sensitive. If they are equal return true, otherwise return
false;

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThreeEqual
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Test Data:
isThreeEqual (“day”, “DAY”, “DaY”) ----- TRUE
isThreeEqual (“week”, “weekend”, “monday”) ----- FALSE
isThreeEqual (“java”, “JAVa”, “jaVa”) ----- TRUE
isThreeEqual (“javaProgramming”, “java Programming”, “Programming in Java”) ---FALSE*/