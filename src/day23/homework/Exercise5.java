package day23.homework;

public class Exercise5 {
	
	public static void main(String[] args) {
		Exercise5 obj=new Exercise5 ();
		String r1= obj.toLower("espn");
		String r2= obj.toLower("SOCCER");
		String r3= obj.toLower("STRING CLASS");
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
	
	
	protected	String toLower(String strOne) {
		String result= " ";
		
	result= strOne.toLowerCase();
	return result;
	
	}
}









/**
5. Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data:
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class;
 		
*/