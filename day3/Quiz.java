package com.hcl.day3;

public class Quiz {
	int x;
	public static void main(String[] args) {
		Quiz obj1=new Quiz();
		obj1.x=12;
		Quiz obj2=obj1;
		obj2.x=13;
		System.out.println(obj1.x);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
