package day11.homework;

public class Exercise3 {
	
	public static void main(String[] args) {
	
	
	
	getForLoopResult(1, 5);
	System.out.println("******");
	
	getForLoopResult(25, 15);
}



public static void getForLoopResult(int numOne, int numTwo) {
	
	
	if(numOne > numTwo) {
		
		for(int i = numOne; i >= numTwo; i--) {
			System.out.println(i);
		}
		
	} else if ( numOne < numTwo) {
		
		for(int i = numOne; i<= numTwo; i++) {
			System.out.println(i);
		}
	}
}

}