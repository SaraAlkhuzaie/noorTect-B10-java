package day13.homework;

public class Exercies1 {
	public static void main(String[] args) {
	boolean r1=	positiveNegative(10, 2, false);//false
	boolean r2=	positiveNegative(10, 10, true); //false
	boolean r3=	positiveNegative(10, 10, false); //false
	boolean r4=	positiveNegative(-10, -10, true); //true
	boolean r5=	positiveNegative(-10, 10, false); //true
	boolean r6=	positiveNegative(10, -10, false); //true
	boolean r7=	positiveNegative(-10, 10, true); //false
	boolean r8=	positiveNegative(10, -10, true); //false

	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	System.out.println(r6);
	System.out.println(r7);
	System.out.println(r8);

	}

	public static boolean positiveNegative(int numOne, int numTwo, boolean isStatus) {
		boolean result = false;

		if ((numOne < 0 && numTwo > 0) && isStatus == false) {
			result = true;
		} else if ((numOne > 0 && numTwo < 0) && isStatus == false) {
			result = true;
		} else if ((numOne < 0 && numTwo < 0) && isStatus == true) {

			result = true;
		}

		return result;
	}

}