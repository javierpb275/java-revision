package com.javi.revision.oop2.abstractclasses;

//abstract class: restricted class that cannot be used to create objects
public abstract class Employee {
	private int monthlySalary;

	public Employee() {
		monthlySalary = 1000;
	}

	public Employee(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	//abstract methods: must be implemented in child classes
	public abstract int getYearlySalary();

}
