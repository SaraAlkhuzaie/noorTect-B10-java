package day11.homework;

public class Exercise1 {
	public static void main(String[] args) {
		getResult(15, 5);
		getResult(2, 5);
		getResult(2, 2);

	}

	public static void getResult(int numOne, int numTwo) {
		int result = 0;
		String operationSign = "";

		if (numOne > numTwo) {

			result = numOne - numTwo;

			operationSign = " - ";
		} else if (numOne < numTwo) {

			result = numOne + numTwo;
			operationSign = " + ";
		} else {

			result = numOne * numTwo;
			operationSign = " * ";
		}

		System.out.println(numOne + operationSign + numTwo + " = " + result);

	}

}
