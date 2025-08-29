package oops.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee();

        // Use the public setter method to set the salary
        emp.setSalary(50000.0);
        
        // Use the public getter method to get and print the salary
        System.out.println("Employee's salary: $" + emp.getSalary());

        // Try to set an invalid salary (will be ignored due to validation in setSalary)
        emp.setSalary(-1000.0);
        System.out.println("Employee's salary after invalid attempt: $" + emp.getSalary());
    }
}
