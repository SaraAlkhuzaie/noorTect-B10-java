package day23.homework;

public class Exersie6 {
	
	public static void main(String[] args) {
		String r1 = combineStr("day", "ONE", "work", "HOURS");
		String r2 = combineStr("week", "weekend", "monday", "Tuesday");
		String r3 = combineStr("restoN", "vA", "baltiMORE", "MD");
		String r4 = combineStr("java", "is", "fun", "LEARNING");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}
	
	
	
	
	
	
	protected static String combineStr(String strOne,String strTwo,String strThree,String strFour) {
		String result = "";
		String  s1 = strOne.toUpperCase();
		String  s2 = strThree.toUpperCase();
		String  s3= strTwo.toLowerCase();
		String   s4= strFour.toLowerCase();
				 
		result = s1.concat(s2).concat(s3).concat(s4);
		
		
			return result;
	}
	

}
