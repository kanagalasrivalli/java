package com.hcl.Quiz;

public class Box {
	public void show(Object ob) {
		if (ob=="ABC") {
			System.out.println("Correct A and D");
		}else{
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		String s = "ABC";
		Box obj =new Box();
		obj.show(s);
	}

}
