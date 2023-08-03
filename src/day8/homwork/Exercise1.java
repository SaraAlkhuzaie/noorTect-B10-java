package day8.homwork;

public class Exercise1 {
	public static void main(String[] args) {
	

				int temperature = 90;
				String howIsWeather = "";
				String howShouldIDrive = "";
				String message = "";
				boolean isStatus = true;

					// 90 < 30 --> false
				if (temperature < 30) {
					howIsWeather = "FREEZING";
					
							//90 < 50 --> false
				} else if (temperature < 50) {
					howIsWeather = "COLD";
							//90 < 90 --> false
				} else if (temperature < 90) {
					howIsWeather = "HOT";
							//90 > 90 false
				} else if(temperature > 90) {
					howIsWeather = "ERROR";
					message = "Read Requirement out loud";
					isStatus = false;
				}
				
				
				if( howIsWeather != "ERROR") {	
					
					if(howIsWeather == "FREEZING") {
						howShouldIDrive = "Don't Drive";
					} else if ( howIsWeather == "COLD") {
						howShouldIDrive = "Drive with Heater On";
					} else if ( howIsWeather == "HOT") {
						howShouldIDrive = "Drive with AC On";
					}		

				} else if (howIsWeather == "ERROR"){
					isStatus = false;
				}
				
				if(isStatus == false) {
					System.out.println("What is the Temperatur: "+ temperature);
					System.out.println("How is the Weather: " + howIsWeather);
					System.out.println("WHat is the Message: " + message );
					System.out.println("What is the Status: " + isStatus);
				} else {
					System.out.println("What is the Temperatur: "+ temperature);
					System.out.println("How is the Weather: " + howIsWeather);
					System.out.println("How Should I Drive: " + howShouldIDrive);
				}
			}
		}














