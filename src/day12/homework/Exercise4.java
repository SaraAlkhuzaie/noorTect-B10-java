package day12.homework;

public class Exercise4 {
	public static void main(String[] args) {
		int result1 = difference21 (10);
		int result2  =difference21 ( 20);
		 
		int result3  = difference21 ( 25);
		
		int result4 = difference21 ( 50);
		

			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			
	}

	public static int difference21( int num) {
		
	int result = 0;
	int numOne = 21;
	
	if ( num < numOne ) {
		result=  num - numOne;
	}else if( num > numOne) {
		result= 2*( num - numOne);
		
		
	}
	
	
	
	
	return result;
}

}


