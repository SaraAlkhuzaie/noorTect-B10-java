package day23.homework;

public class Exercise10 {

	public static void main(String[] args) {
		Exercise10 obj = new Exercise10();

		boolean r1 = obj.isEndWith("java training", "ing");

		boolean r2 = obj.isEndWith("java training", "ng");

		boolean r3 = obj.isEndWith("java training", "java");

		boolean r4 = obj.isEndWith("java training", "train");

		System.out.println(r1);
		System.out.println(r2);

		System.out.println(r3);

		System.out.println(r4);

	}

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;

		result = strOne.endsWith(strTwo);
		return result;



	}

}
