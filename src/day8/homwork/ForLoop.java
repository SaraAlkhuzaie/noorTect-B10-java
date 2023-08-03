package day8.homwork;

public class ForLoop {

	public static void main(String[] args) {
int i = 100;
		
		while ( i <= 200) {
		
			if (i >= 101 && i <= 103) {
				System.out.println("Category 1: Windspeed: " + i);
			} else if (i >= 115 && i <= 118) {
				System.out.println("Category 2: Windspeed: " + i);
			} else if (i >= 130 && i <= 136) {
				System.out.println("Category 3: Windspeed: " + i);
			} else if (i >= 154 && i <= 155) {
				System.out.println("Category 4: Windspeed: " + i);
			} else if (i >= 190 && i <= 194) {
				System.out.println("Category 5: Windspeed: " + i);
	}
			
		i++;	
			
		}
		}
}