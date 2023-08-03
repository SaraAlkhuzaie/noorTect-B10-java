package day8.homwork;

public class PHoneService {

	
		
		public static void main(String[] args) {
			
			int minute = 455;
			int message = 0;
			int data =1;
			String planType = "";
			double cost = 0;
			
	 
			if( minute < 500 && message ==0  && data == 0 ) {
				cost = 40.0;
				planType = "Plan A";
	 
			} else if (minute >= 500 && message <100 && data == 0) {
				cost = 50.0;
				planType = "Plan B";
	 
			} else if (minute < 500 &&  message >= 100 && data == 0) {
				cost = 60.0;
				planType = "Plan C";

			} else if (minute >= 500 && message >= 100 && data == 0) {
				cost = 70.0;
				planType = "Plan D";
			} else if ( minute >= 500 &&  message >= 100 && data < 3) {
				cost = 80.0;
				planType = "Plan E";
			} else if (minute >= 500 && message >= 100 && data >= 3 ) {
				cost = 90.0;
				planType = "Plan F";
			}
			
			
			System.out.println("You should buy "+ planType + ", which costs $" + cost + " per month");
			
			
		}

	}


