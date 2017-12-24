package javaTest;

public class javaTestSample {
	class Employee {
	    String name;
	    double baseSalary;

	    Employee(String name, double baseSalary) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }
	}

	class Sales extends Employee {
	    double commission;

	    public Sales(String name, double baseSalary, double commission) {
	        super(name, baseSalary);
	        this.commission = commission;
	    }
	}
}
