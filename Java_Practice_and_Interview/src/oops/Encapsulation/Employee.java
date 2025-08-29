package oops.Encapsulation;

public class Employee {
	//Declare a private data variable
	
	private double salary;


//Declare a setter method to control the access
public void setSalary(double newSal) {
	if(newSal>0) {
		this.salary=newSal;
	}
	
}

public double getSalary() {
	return salary;
}}