package day23.homework;

public class Exerciese7 {

	public static void main(String[] args) {
		 Exerciese7  obj=new  Exerciese7 ();
		 String r1= obj .helloTo("Denis");
		 String r2= obj .helloTo("Malek");
		 String r3= obj .helloTo("Sara");
		 System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
		 
;	}
	
	
	
	String helloTo (String strOne) {
		
			String result = "";
		
		
		result="Hello".concat(strOne);

		return result;
	
		
	}
}
