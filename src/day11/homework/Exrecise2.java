package day11.homework;

public class Exrecise2 {
	public static void main(String[] args) {

		getWhileLoopResult(50, 30);

		System.out.println("***********");
		
		getWhileLoopResult(5, 20);
	}

	public static void getWhileLoopResult(int numOne, int numTwo) {

		if (numOne > numTwo) {

			while (numOne >= numTwo) {
				System.out.println(numOne);
				numOne--;
			}

		} else if (numOne < numTwo) {

			while (numOne <= numTwo) {
				System.out.println(numOne);
				numOne++;
	
					}
				}
	}
}