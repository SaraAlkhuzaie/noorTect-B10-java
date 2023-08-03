package day12.homework;

public class Exercise1 {
	public static void main(String arg) {

		boolean r1 = sleepIn(false, false);

		boolean r2 = sleepIn(true, false);

		boolean r3 = sleepIn(true, true);

		boolean r4 = sleepIn(false, true);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

	//Approach 1
	public static boolean sleepIn(boolean isWeekDay, boolean isVacation) {

		boolean result = false;

		if (!isWeekDay || isVacation == true) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
	
	//Approach 2
	public static boolean sleepIn2(boolean isWeekDay, boolean isVacation) {

		boolean result = false;

		if (!isWeekDay || isVacation == true) {
			result = true;
		}
		return result;
	}
	
	
	//Approach 3
	public static boolean sleepIn3(boolean isWeekDay, boolean isVacation) {

		boolean result = false;

		result = (!isWeekDay || isVacation == true);
		
		return result;
	}
	
	
	//Approach 4
	public static boolean sleepIn4(boolean isWeekDay, boolean isVacation) {
 
		return (!isWeekDay || isVacation == true);
 
	}
	
	
	
}



