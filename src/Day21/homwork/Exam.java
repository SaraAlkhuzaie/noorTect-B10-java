package Day21.homwork;

public class Exam {

	String subject;

	double score;

	// 3. Create a constructor for the Exam class that takes in two arguments,
	// subject and score, and sets these fields.

	public Exam(String subject, double score) {
		this.subject = subject;
		this.score = score;

	}

//4. Create a method called displayResult that prints the subject and score of the exam.
	public void displayResult() {
		System.out.println(subject);
		System.out.println(score);

	}

//5. Create a method called isPassed that checks if the score is greater than or equal to 60. Return true if it is, otherwise return false.
	
	public boolean isPassed() {
		boolean result = false;

		if (score >= 60) {
			result = true;
		}
		/**
		 * } else { result = false; boolean is false already , it is not nassery.
		 */

		return result;
	}

	/**
	 * 6. Create a method called getGrade that returns the grade based on the score:
	 * 
	 * If the score is greater than or equal to 90, return "A". If the score is
	 * between 80 and 89, return "B". If the score is between 70 and 79, return "C".
	 * If the score is between 60 and 69, return "D". If the score is less than 60,
	 * return "F"
	 */

	public String getGrade() {

		String grate = "";

		if (score >= 90) {
			grate = "A";
		} else if (score >= 80 && score <= 89) {
			grate = "B";
		} else if (score >= 70 && score <= 79) {
			grate = "C";
		} else if (score >= 60 && score <= 69) {
			grate = "D";

		} else {
			grate = "F";

		}
		return grate;

	}

//	7. Create a method called isExcellent that checks if the score is greater than or equal to 95. Return true if it is, otherwise return false.
	public boolean isExcellent() {
		boolean result = false;
		if (score >= 95) {
			result = true;

		}

		return result;

	}

	// 8. Create a method called isImprovementNeeded that checks if the score is
	// less than the previous score. It takes in a double parameter called
	// previousScore and returns true if the score is less than the previousScore,
	// otherwise return false.
	public boolean isImprovementNeeded(double previousScore) {
		boolean result = false;
		if (score < previousScore) {
			result = true;

		}
		return result;

	}

	public static void main(String[] args) {
		Exam obj = new Exam("Math", 95);

		obj.displayResult(); // it dose not return value it void method this why we not printed in main
								// method ,

		System.out.println(obj.isPassed());
		System.out.println(obj.getGrade());
		System.out.println(obj.isExcellent());
		System.out.println(obj.isImprovementNeeded(85));

	}
}
