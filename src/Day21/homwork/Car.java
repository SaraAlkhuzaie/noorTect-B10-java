package Day21.homwork;

public class Car {
	String make;
	String model;
	int year;
	double fuelLevel;

//3. Create a constructor for the Car class that takes in four arguments, make, model, year, and fuelLevel, and set these fields.
	public Car(String make, String model, int year, double fuelLevel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelLevel = fuelLevel;
	}
	// 4. Create a method called start that checks if the fuel level is greater than
	// 0. If so, print "Car started." Otherwise, print "Out of fuel. Please refuel."

	public void start() {
		if (fuelLevel > 0) {
			System.out.println("Car started.");
		} else {
			System.out.println("Out of fuel. Please refuel.");
		}
	}

	// 5. Create a method called refuel that takes in an amount and adds it to the
	// fuel level.
	public void refuel(double amount) {

		fuelLevel = amount + fuelLevel;

	}
	// 6. Create a method called drive that takes in a distance. Calculate the fuel
	// consumption based on the distance and deduct it from the fuel level. If there
	// is not enough fuel, print "Insufficient fuel. Please refuel."

	public void drive(double distance) {
		double amountOfFuelCarConsume = distance / 22;
		if (amountOfFuelCarConsume > fuelLevel) {
			System.out.println(fuelLevel);
		} else {
			System.out.println("Insufficient fuel. Please refuel.");

		}

	}
	// 7. Create a method called checkFuelLevel that returns the current fuel level
	// of the car.

	public double checkFuelLevel() {
		double result = 0;
		result = fuelLevel;
		return result;

	}

	public static void main(String[] args) {
		Car obj = new Car("Toyota", "Camry", 2022, 50.0);
		obj.start();
		obj.drive(100);
		System.out.println(obj.checkFuelLevel());
		obj.refuel(20);
		obj.drive(200);
		System.out.println(obj.checkFuelLevel());
	}

}
