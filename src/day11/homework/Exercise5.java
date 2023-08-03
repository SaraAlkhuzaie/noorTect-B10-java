package day11.homework;

public class Exercise5 {
	
	
	
	
	public static void main(String[] args) {

		calculate(2, 6, '*');
		calculate(2, 5, '+');
		calculate(2, 5, '@');
		calculate(20, 5, '/');
		calculate(2, 5, '#');
		calculate(2, 5, '-');
		
		System.out.println("***************");
		calculate2(2, 6, '*');
		calculate2(2, 5, '+');
		calculate2(2, 5, '@');
		calculate2(20, 5, '/');
		calculate2(2, 5, '#');
		calculate2(2, 5, '-');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationType) {
		double result = 0;
		String message = "";

		switch (mathOperationType) {

		case '+':
			result = numOne + numTwo;
			break;
		case '-':
			result = numOne - numTwo;
			break;
		case '*':
			result = numOne * numTwo;
			break;
		case '/':
			result = numOne / numTwo;
			break;
		default:
			message = "INVALID OPERATION";

		}

		if (message == "INVALID OPERATION") {
			System.out.println(message);
		} else {

			System.out.println(numOne + " " + mathOperationType + " " + numTwo + " = " + result);
		}
	}

	public static void calculate2(double numOne, double numTwo, char mathOperationType) {
		double result = 0;
		String message = "";

		if (mathOperationType == '+') {
			result = numOne + numTwo;
		} else if (mathOperationType == '-') {
			result = numOne - numTwo;
		} else if (mathOperationType == '*') {
			result = numOne * numTwo;
		} else if (mathOperationType == '/') {
			result = numOne / numTwo;
		} else {
			message = "INVALID OPERATION";
		}

		if (message == "INVALID OPERATION") {
			System.out.println(message);
		} else {

			System.out.println(numOne + " " + mathOperationType + " " + numTwo + " = " + result);
		}
	}

}


