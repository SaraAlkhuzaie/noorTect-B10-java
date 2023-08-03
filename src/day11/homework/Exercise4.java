package day11.homework;

public class Exercise4 {
	public static void main(String[] args) {
		

		getDoWhileLoopResult(1, 10, 2);
		System.out.println("***********");
		getDoWhileLoopResult(50, 10, 5);
		System.out.println("***********");
		getDoWhileLoopResult(50, 10, 2);

	}
	
	
	public static void getDoWhileLoopResult(int numOne, int numTwo, int incrementByNum) {
		
		
		if(numOne > numTwo) {	
			do {
				System.out.println(numOne);
				numOne = numOne - incrementByNum;	
			} while ( numOne >= numTwo);
			
			
		}else if ( numOne < numTwo) {
			
			do {
				System.out.println(numOne);	
				numOne = numOne + incrementByNum;  
			}while ( numOne <= numTwo);
			
		}
		
	}
	
	
}