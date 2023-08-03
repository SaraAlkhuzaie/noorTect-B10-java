package day23.homework;

public class Exercise17 {
	
	
	
	
	
	public static void main(String[] args) {
		
		
			Exercise17 obj=new Exercise17();;
			boolean r1= obj.endsWithNG ("I like to practice");
			boolean r2= obj.endsWithNG ("Everyone is practicing");
			boolean r3= obj.endsWithNG ("I am studying");
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
			
			
			
	}
	
	public boolean endsWithNG (String strOne) {
boolean result = false;

result= strOne.endsWith("ng"                                                                                                                                                                                                                                                                                                                                                                                                                                                                            );


return result;
	}
}
