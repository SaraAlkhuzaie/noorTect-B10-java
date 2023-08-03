package day4.homework;

public class ExerciseIf {

	public static void main(String args[]) {

		int temperature = 0;
		String season;
		String whatAmThinking;

		if (temperature >= 0 && temperature <= 20) {
			season = "Winter";
			whatAmThinking = "Too cold, can't wait for summer";

		} else if (temperature >= 21 && temperature <= 40) {
			season = "Fall";
			whatAmThinking = "Confused, recovering from cold ";

		} else if (temperature >= 41 && temperature <= 60) {
			season = "spring";
			whatAmThinking = "More confused, thinking about winter";
		} else if (temperature >= 61 && temperature <= 100) {

			season = "summer";
			whatAmThinking = "Too hot, can't wait for winter";
		} else {
			season = " Wrong data ";
			whatAmThinking = "Jave&Coffe";
		}
			System.out.println("temperature");
			System.out.println("season");
			System.out.println("whatAmThinking");

		

	}

}
