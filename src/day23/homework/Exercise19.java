package day23.homework;

public class Exercise19 {
	public static void main(String[] args) {
		boolean r1 = isSame("educated");// t
		boolean r2 = isSame("modified memo");// t
		boolean r3 = isSame("I am studying");// f
		 System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
	
	}
	
	
	
	public  static boolean isSame(String strOne) {
		boolean result=false;
		 String firstTwoChar= strOne.substring(0,2);
		int thelasTwoChar= strOne.length()-2;
		 String lasTwoCha1= strOne.substring(thelasTwoChar);
		if (firstTwoChar .equals( lasTwoCha1)) {
			result= true;
			
		}
		
		return result;
		/** or 
		
		 String firstTwoChar= strOne.substring(0,2);
		 boolean lasTwoCha1 = str one . endsWith (firstTwoChar);
		 
	 if 
	 firstTwoChar== true returen true
	 */
		
		
		
		/** 
		 * lasTwoCha1 = strone.length()-2;
		 *  String lasTwoCha1= strOne.substring(thelasTwoChar);
		 * firstTwoChar= sterone.sturtwith(lasTwoCha1);
		 */
	}

}
