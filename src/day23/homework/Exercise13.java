package day23.homework;

public class Exercise13 {
	public static void main(String[] args) {
		Exercise13 obj=new Exercise13();
		
		
		boolean r1 = obj.isStartWith ("java training", "ing");
		boolean r2 = obj .isStartWith ("java training","ja");
		boolean r3 = obj .isStartWith ("java training","java");
		boolean r4 = obj .isStartWith ("java training","train");
		System.out.println(r1);
		System.out.println(r2);

		System.out.println(r3);

		System.out.println(r4);

	}
	
	
	
	
	
	
	boolean isStartWith (String strOne,String strTwo) {
		
		
		
		boolean result= false;

		
		result= strOne.startsWith(strTwo);
		return result;
	}

}
