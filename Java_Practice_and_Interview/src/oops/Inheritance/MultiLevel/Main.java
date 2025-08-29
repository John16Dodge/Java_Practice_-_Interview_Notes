package oops.Inheritance.MultiLevel;

public class Main {
	 public static void main(String[] args) {
	     Puppy myPuppy = new Puppy();
	     myPuppy.eat();   // Inherited from Animal
	     myPuppy.bark();  // Inherited from Dog
	     myPuppy.weep();  // Own method
	 }
	}

