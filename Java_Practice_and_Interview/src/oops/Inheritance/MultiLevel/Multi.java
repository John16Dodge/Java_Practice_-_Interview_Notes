package oops.Inheritance.MultiLevel;

//Grandparent class
class Animal {
 void eat() {
     System.out.println("The animal is eating.");
 }
}

//Parent class
class Dog extends Animal {
 void bark() {
     System.out.println("The dog is barking.");
 }
}

//Child class
class Puppy extends Dog {
 void weep() {
     System.out.println("The puppy is weeping.");
 }
}

//Main class to test
