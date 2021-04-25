package com;

public class RegEmp extends Employee {
	int bonus,salary;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegEmp [bonus=" + bonus + ", salary=" + salary + "]";
	}
	

}
