package com.hcl.day4;

public class Payroll {
	static int salary;
	public void addSalary(int sal){
		salary+=sal;
		
	}
	public static void main(String[] args) {
		Payroll empTeja = new Payroll();
		Payroll empSneha = new Payroll();
		Payroll empSai = new Payroll();
		empTeja.addSalary(20000);
		empSneha.addSalary(30000);
		empSai.addSalary(40000);
		System.out.println("Grand salary " +Payroll.salary);
	}

}
