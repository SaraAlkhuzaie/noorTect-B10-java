package day12.homework;

public class Exercise2 {
	public static void main(String[] args) {

		boolean r1 = monkeyTrouble(true, true);

		boolean r2 = monkeyTrouble(false, false);

		boolean r3 = monkeyTrouble(true, false);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

	// Approach 1
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;

		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			result = true;
		}

		return result;
	}

	// Approach 2
	public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
		boolean result = false;

		if ((aSmile && bSmile) || (aSmile == false && bSmile == false)) {
			result = true;
		}

		return result;
	}

	// Approach 3
	public static boolean monkeyTrouble3(boolean aSmile, boolean bSmile) {
		boolean result = false;

		if (aSmile == bSmile) {
			result = true;
		}

		return result;
	}

	// Approach 4
	public static boolean monkeyTrouble4(boolean aSmile, boolean bSmile) {

		return (aSmile == bSmile);

	}


		
		
		
		
	}
	
	
	
	
	
	
	

