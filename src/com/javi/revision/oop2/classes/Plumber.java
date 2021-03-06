package com.javi.revision.oop2.classes;

import com.javi.revision.oop2.abstractclasses.Employee;
import com.javi.revision.oop2.interfaces.Payable;

public class Plumber extends Employee implements Payable {

	int experience;

	public Plumber(int experience, int monthlySalary) {
		super(monthlySalary);

		this.experience = experience;

	}

	@Override
	public int getYearlySalary() {
		return getMonthlySalary() * 14;
	}

	@Override
	public int getWagesNumber() {
		return 14;
	}

	@Override
	public int getFeesSS() {
		return 450;
	}

}
