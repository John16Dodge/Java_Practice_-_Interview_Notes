package oops.Polymorphism.RunTime;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

class Dog extends Animal {
    @Override // Optional but recommended annotation
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


