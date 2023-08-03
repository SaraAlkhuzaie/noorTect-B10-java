package day6.homwork;

public class Homwork3 {
	public static void main(String[] args) {
		
	

			char mathOperation = '@';

			double numOne = 20.0;
			double numTwo = 5.0;
			double result = 0;
			String message = "NONE";
			boolean isCorrectOperation = true;

			if (mathOperation == '+') {
				result = numOne + numTwo;
			} else if (mathOperation == '-') {
				result = numOne - numTwo;
			} else if (mathOperation == '*') {
				result = numOne * numTwo;
			} else if (mathOperation == '/') {
				result = numOne / numTwo;
			} else if (mathOperation == '%') {
				result = numOne % numTwo;
			} else {
				message = "WRONG INPUT DATA";
				isCorrectOperation = false;
			}
			
			if(message == "WRONG INPUT DATA" && isCorrectOperation == false) {
				System.out.println(message);
				System.out.println(isCorrectOperation);
			}else {
				System.out.println(numOne + " " + mathOperation + " " + numTwo + " = " + result);
			}


		
		
		
		
	}

}
