package Day21.homwork;

public class WeatherReport {

	String location;
	double temperature;
	double humidity;
	double windSpeed;

	// 3. Create a constructor for the WeatherReport class that takes in four
	// arguments, location, temperature, humidity, and windSpeed, and set these
	// fields.
	public WeatherReport(String location, double temperature, double humidity, double windSpeed) {

		this.location = location;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windSpeed = windSpeed;

	}

//4. Create a method called displayWeather that prints the weather report for the location. Include information such as temperature, humidity, and wind speed.

	public void displayWeather() { // if it dosnt return value ,we can't printed in main method
		System.out.println(location);
		System.out.println(temperature);

		System.out.println(humidity);

		System.out.println(windSpeed);

	}

//5. Create a method called isTemperatureHigh that checks if the temperature is greater than 30 degrees Celsius. Return true if it is, otherwise return false.
	public boolean isTemperatureHigh() {
		boolean result = false;
		if (temperature > 30) {
			result = true;

		//} else {
			//result = false; we don't use else because the boolean already false
		}
		return result;

	}

//6. Create a method called isHumidityHigh that checks if the humidity is greater than 70. Return true if it is, otherwise return false.
	public boolean isHumidityHigh() {
		boolean result = false;
		if (humidity > 70) {
			result = true;

		//} else {
		//	result = false;
		}
		return result;

	}

//7. Create a method called isWindy that checks if the wind speed is greater than 20 km/h. Return true if it is, otherwise return false.

	public boolean isWindy() {
		boolean result = false;
		if (windSpeed > 20) {
			result = true;

		//} else {
			//result = false;
		}
		return result;

	}

/**8. Create a main method that demonstrates how the class can be used:
 
	a. Create a weather report object for a location with a temperature of 25 degrees Celsius, humidity of 80, and wind speed of 15 km/h.
	b. Display the weather report for the location.
	c. Check if the temperature is high and print the result.
	d. Check if the humidity is high and print the result.
	e. Check if it's windy and print the result.
*/

public static void main(String[] args) {
	
{WeatherReport obj = new WeatherReport("VA",25.0,80.0,15);
obj.displayWeather();
System.out.println("is temperature" +  obj.isTemperatureHigh());
System.out.println("is humidity "+ obj. isHumidityHigh());

System.out.println("is windy " + obj. isWindy ());

}

}
}



