package com.hcl.day4;

public class Student2 {
	int sno;
	String Firstname;
	String Lastname;
	double cgp;
	public Student2() {
		sno = 1;
		Firstname = "Saraswathi";
		Lastname = "Kumba";
		cgp = 10;
	}
	public Student2(int sno, String firstname, String lastname, double cgp) {
		super();
		this.sno = sno;
		Firstname = firstname;
		Lastname = lastname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student2 [sno=" + sno + ", Firstname=" + Firstname
				+ ", Lastname=" + Lastname + ", cgp=" + cgp + "]";
	}
	
	

}
