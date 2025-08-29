package oops.Inheritance.Hierarchial;

//Parent class
class Vehicle {
 void run() {
     System.out.println("The vehicle is running.");
 }
}

//Child class 1
class Car extends Vehicle {
 void drive() {
     System.out.println("The car is driving.");
 }
}

//Child class 2
class Bike extends Vehicle {
 void pedal() {
     System.out.println("The bike is pedaling.");
 }
}

//Main class to test
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
