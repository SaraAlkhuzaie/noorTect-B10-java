package day23.homework;

public class Exercise9 {


	

		public static void main(String[] args) {

			Exercise9 obj = new Exercise9();
			
			boolean r1 = obj.isThere ("java training", "ini");
			boolean r2 = obj.isThere ("java training", "ava");
			boolean r3 = obj.isThere ("java training", "AVA");
			boolean r4 = obj.isThere ("java training", "Java");
			
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			System.out.println(r4);
		}
		
		private boolean  isThere(String strOne, String value) {
			boolean result = false;
			
			if(strOne.contains(value)) {
				result = true;
			}
			
			return result;
		}
		
	}
