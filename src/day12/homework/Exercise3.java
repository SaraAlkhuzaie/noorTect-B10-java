package day12.homework;

public class Exercise3 {
	public static void main(String[] args) {
		int result1 = getOutcome ( 5, 2);
		int result2  =getOutcome ( 5, 20);
		 
		int result3  = getOutcome ( 20, 20);
		 

			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			
	}

	public static int getOutcome(int numOne, int numTwo) {
		
	int result = 0;
	
	
	if ( numOne > numTwo) {
		result=  numOne - numTwo;
	}else if( numOne < numTwo) {
		result=  numOne + numTwo;
		
		
	}else {
	result = 2 * (numOne + numTwo);
	}
	
	
	return result;
}

}
