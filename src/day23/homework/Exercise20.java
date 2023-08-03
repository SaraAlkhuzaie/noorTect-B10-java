package day23.homework;

public class Exercise20 {
	public static void main(String[] args) {
		String r1 = removeT("Test Data");
		String r2 = removeT("Testcricket");
		String r3 = removeT("I am studying");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

	public static String removeT (String strOne) {
		String result = "";
		String strOne1= strOne.toUpperCase();// importent
		int L= strOne1.length()-1;
		boolean firsChar= strOne1.startsWith("t");
		boolean lastChar= strOne1.endsWith("t");
		
	

		
		if (firsChar ==  lastChar ){
			result = strOne1.substring(1,L);
		
			 
			}else { 
				result= strOne;
			}
		

		return result;
	
		
		
	}

}


