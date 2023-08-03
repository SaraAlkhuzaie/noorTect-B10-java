 package day13.homework;

public class Exercies2 {
	public static void main(String[] args) {

		boolean r1 = icyHot(101, -20);
		boolean r2 = icyHot(-40, 110);
		boolean r3 = icyHot(-440, 100);
		boolean r4 = icyHot(10, -20);
		boolean r5 = icyHot(11, 11);
		boolean r6 = icyHot(-100, 90);

		System.out.println(r1);//t
		System.out.println(r2);//t
		System.out.println(r3);//f
		System.out.println(r4);//f
		System.out.println(r5);//f
		System.out.println(r6);//f

	}

	public static boolean icyHot(int tempOne, int tempTwo) {
		boolean result = false;

		if (tempOne < 0 && tempTwo > 100) {
			result = true;
		} else if (tempOne > 100 && tempTwo < 0) {
			result = true;
		}

		return result;
	}

}


