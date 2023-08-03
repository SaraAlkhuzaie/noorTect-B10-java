package day8.homwork;

public class OddEven {
	public static void main(String[] args) {
		
		int oddTotal = 0;
		int evenTotal = 0;
		
		for(int i = 1; i <= 10; i++){
			 
			if ( i % 2 == 0 ) {
				
				evenTotal = evenTotal + i; 
				
			} else {
				
				oddTotal = oddTotal + i;
			}
		}
		
		System.out.println("Sum of ODD Numbers:  "+ oddTotal );
		System.out.println("Sum of EVEN Numbers: "+ evenTotal);
		
	}
	}