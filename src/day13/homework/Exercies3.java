package day13.homework;

public class Exercies3 {
	public static void main(String[] args) {

		boolean r1 = inRange(13, 55);// t
		boolean r2 = inRange(55, 13);// t
		boolean r3 = inRange(55, 55);// f
		boolean r4 = inRange(13, 13);// f

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

	public static boolean inRange(int numOne, int numTwo) {
		boolean result = false;

		// create variable to keep the outcome wether it is in range or not

		boolean isNumOneRange = (numOne >= 10 && numOne <= 20);
		boolean isNumTwoRange = (numTwo >= 10 && numTwo <= 20);

		if (isNumOneRange == true && isNumTwoRange == false) {
			result = true;
		} else  {
			result = false;
		}

		return result;
	}
	
	public static boolean inRange2(int numOne, int numTwo) {
		boolean result = false;

		if ((numOne >= 10 && numOne <= 20) && (!(numTwo >= 10 && numTwo <= 20))) {
			result = true;
		} else if ((numTwo >= 10 && numTwo <= 20) && (!(numOne >= 10 && numOne <= 20))) {
			result = true;
		}

		return result;
	}

}