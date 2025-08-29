package oops.Inheritance.Hierarchial;

public class Main {
	 public static void main(String[] args) {
	     Car myCar = new Car();
	     myCar.run(); // Inherited
	     myCar.drive(); // Own method

	     Bike myBike = new Bike();
	     myBike.run(); // Inherited
	     myBike.pedal(); // Own method
	 }
	}