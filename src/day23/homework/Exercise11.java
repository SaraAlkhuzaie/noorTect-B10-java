package day23.homework;

public class Exercise11 {
	 public static void main(String[] args) {
		 Exercise11 obj=new Exercise11();
		 String r1 = obj.threeEqual("Java Pro", 'P', 'B');
		 String r2 = obj.threeEqual("Lazy mode,", 'm', 'c');
		 String r3 = obj.threeEqual("trainning", 'T', ' ');
		 System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
	}
	
	
	
	
	
	
	
	protected String threeEqual(String str,char oldChar,char newChar) {
		String result= "";
		result= str.replace(oldChar, newChar);
				
				
				
				
				return result;
		
	}
	
	
	
	
	
	
	
	
	
	

}
