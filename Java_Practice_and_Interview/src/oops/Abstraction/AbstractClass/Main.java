package oops.Abstraction.AbstractClass;

public class Main {
	 public static void main(String[] args) {
	     // You cannot instantiate an abstract class
	     // Vehicle v = new Vehicle(); // This would cause a compile-time error

	     Car myCar = new Car();
	     myCar.move();
	 }
	}
