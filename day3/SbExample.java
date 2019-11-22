package com.hcl.day3;

public class SbExample {
	public void show(){
		StringBuilder sb=new StringBuilder("welcome to java");
		System.out.println(sb);
		sb.append("From HCL Batch All the best..");
		System.out.println(sb);
		sb.insert(3,"sneha");
		System.out.println(sb);
		sb.delete(3,8);
		System.out.println(sb);
		sb.append("\n FirstName validatio Failed...");
		System.out.println("\n LastName validation Failed...");
		System.out.println(sb);
		
	
		
	}
	public static void main(String[] args) {
		new SbExample().show();
	}

}
