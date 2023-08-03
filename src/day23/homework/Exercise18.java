package day23.homework;

public class Exercise18 {
	public static void main(String[] args) {
		

		Exercise18 obj=new Exercise18();;
		String r1= obj.getNewStr ("Welcome", "home");
		String r2= obj.getNewStr ("java", "door");
		String r3= obj.getNewStr ("cooking", "pasta");
		String r4= obj.getNewStr ("pro", "gress");
		 System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			System.out.println(r4);
	}

	
	
	
	
	
	
	
	public String getNewStr (String strOne,String strTwo) {
		String result = "";
		
	
			int L1=strOne.length();
			int L2=strTwo.length();
			if (L1 == L2) {
				result= strOne .concat(strTwo);
			}else if (L1>L2) {
				int L3= L1-L2;
				 String newStrOne= strOne.substring( L3);
				 result= newStrOne .concat(strTwo);
			}else if (L2>L1) {
				int L4= L2-L1;
				String newStrTwo= strTwo.substring(L4);
				result= strOne.concat(newStrTwo);
				
				
				
			
		}
		

		return result;

		
	}

}
