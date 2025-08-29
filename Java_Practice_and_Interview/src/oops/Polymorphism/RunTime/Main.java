package oops.Polymorphism.RunTime;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // A Dog object with an Animal reference
        Animal myCat = new Cat(); // A Cat object with an Animal reference
        
        myDog.makeSound(); // Output: The dog barks.
        myCat.makeSound(); // Output: The cat meows.
    }
}
