package day8.homwork;

public class CozaWhileLoop {public CozaWhileLoop() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] arg) {

		int i = 1;

		while (i <= 50) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("CozaLoza");
			} else if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("LozaWoza");
			} else if (i % 3 == 0) {
				System.out.println("Coza");
			} else if (i % 5 == 0) {
				System.out.println("Loza");
			} else if (i % 7 == 0) {
				System.out.println("Woza");
			} else {
				System.out.println(i);
			}

			i++;
		}

	}

}