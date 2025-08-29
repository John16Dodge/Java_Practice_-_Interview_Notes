package oops.Abstraction.Interface;

//Interface
interface Shape {
double getArea(); // Method is implicitly abstract and public
}

//Class implementing the interface
class Circle implements Shape {
private double radius;

public Circle(double r) {
   this.radius = r;
}

@Override
public double getArea() {
   return Math.PI * radius * radius;
}
}
