package oops.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));        // Calls the first method
        System.out.println(calc.add(2, 3, 4));     // Calls the second method
        System.out.println(calc.add(2.5, 3.5));    // Calls the third method
    }
}
