package day4.homework;

public class VairableHomework1 {
	

public static void main(String[] args) {
		
		int dayNum = 2;
		boolean doIhaveLecture = false;
		boolean doIhaveExtraSession = false;
		boolean doIhaveTutoringSession = false;
		String instructorName = "NONE";
		String whatAmIDoing = "IDK";
		String time = "PM";
		
		
		
		if( dayNum == 1 || dayNum == 3 || dayNum == 5 || dayNum == 7) {
			
			doIhaveLecture = true;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = false;
			instructorName = "Fahim";
			whatAmIDoing = "Attending Lecture and tyring not to blink";
			
			if(dayNum == 7 && time == "AM") {
				instructorName = "Muhammet";
				doIhaveLecture = false;
				doIhaveExtraSession = true;
				whatAmIDoing = "Attending Extra Session to convince java to be my best friend";
			}
			
		} else if ( dayNum == 2 || dayNum == 4) {
			doIhaveLecture =false;
			doIhaveExtraSession = false;
			doIhaveTutoringSession = true;
			instructorName = "Muhammet";
			whatAmIDoing = "Attending Tutoring Session and having FUN with JAVA";
			
			
		} else if (dayNum == 6 || dayNum == 7) {
			doIhaveLecture = false;
			doIhaveExtraSession = true;
			doIhaveTutoringSession = false;
			instructorName = "Muhammet";
			whatAmIDoing = "Attending Extra Session to convience java to be my best friend";
			
			if(dayNum == 7 && time =="PM") {
				instructorName = "Fahim";
				doIhaveLecture = true;
				doIhaveExtraSession = false;
				whatAmIDoing = "Attending Lecture and tyring to not blink";
			}

		}
		
		System.out.println(dayNum);
		System.out.println(doIhaveLecture);
		System.out.println(doIhaveExtraSession);
		System.out.println(doIhaveTutoringSession);
		System.out.println(instructorName);
		System.out.println(whatAmIDoing);

	}
}
				
				
				