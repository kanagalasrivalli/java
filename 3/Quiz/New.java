package com.hcl.Quiz;

public class New {
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.showData();
		Student s2 = new Student();
		s2.showData();
	}
}
class Student{
	int a;
	static int b;
	Student() {
		b++;
	}
	public static void main(String[] args) {
		System.out.println("valu a= " +a);
		System.out.println("valu b =" +b);
	}
}
