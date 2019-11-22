package com.hcl.day4;

public class StDemo {
	
	void show(){
		System.out.println("Show Method....");
	}
	static void display(){
		System.out.println("From Display showed...");
	}
	public static void main(String[] args) {
		new StDemo().show();
		StDemo.display();
	}

}
