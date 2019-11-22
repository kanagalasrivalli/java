package com.hcl.day4;

public class Emplyleave {
	int empno;
	String name;
	String job;
	double salary;
	int leaveavil;
	
	public Emplyleave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emplyleave(int empno, String name, String job, double salary,int leaveavil) {
		super();
		this.empno = empno;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.leaveavil = leaveavil;
	}

	@Override
	public String toString() {
		return "Emplyleave [empno=" + empno + ", name=" + name + ", job=" + job
				+ ", salary=" + salary + ", leaveavil=" + leaveavil + "]";
	}

	public int check(Object obj){
		
		Emplyleave e=(Emplyleave)obj;
		if(e.job=="manager"){
			return e.leaveavil=30;
		}else{
			return e.leaveavil=20;
		}
	}
	
	public enum LeaveType {
		EL,PL,ML
	}
	
	public enum Leavestatus {
		APPROVED,PENDING,REJETED	
	}
	
	public void LeaveHistory(String empno,int leaveTaken,String LeaveType,String LeaveStatus){
		
		
	}
	public static void main(String[] args) {
		
		Emplyleave e= new Emplyleave(1, "sneha", "Developer", 80000,0);
		Emplyleave e2= new Emplyleave(2, "Tejasree", "manager", 100000,0);
		Emplyleave e3= new Emplyleave(3, "Sai", "Tester", 80000,0);
		Emplyleave e4= new Emplyleave(4, "Roshini", "Programmer", 80000,0);
		Emplyleave[] arr = {e,e2,e3,e4};
		
		for (Emplyleave emplyleave : arr) {
			new Emplyleave().check(emplyleave);
			System.out.println(emplyleave);
		}
	}

	
}
