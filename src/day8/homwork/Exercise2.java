package day8.homwork;

public class Exercise2 {
	public static void main(String[] args) {

		int n1 = 2;
		int n2 = 3;
		int n3 = 1;
		int n4 = 7;
		int n5 = 44;
		int n6 = 2;
		int highestNum = n1;
		if (n2 > highestNum) {

			highestNum = n2;
		}
		if (n3 > highestNum) {
			highestNum = n3;

		}
		if (n4 > highestNum) {
			highestNum = n4;
		}
		if (n5 > highestNum) {
			highestNum = n5;
		}
		if (n6 > highestNum) {
			highestNum = n6;
		}

		System.out.println(highestNum);
	}

}
