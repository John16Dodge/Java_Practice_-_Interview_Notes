package oops.Abstraction.AbstractClass;

//Abstract class
abstract class Vehicle {
 private String color;

 // Abstract method: no implementation here
 public abstract void move();

 // Concrete method: with an implementation
 public void setColor(String c) {
     this.color = c;
 }
}

//Subclass implementing the abstract method
class Car extends Vehicle {
 @Override
 public void move() {
     System.out.println("The car drives on the road.");
 }
}


