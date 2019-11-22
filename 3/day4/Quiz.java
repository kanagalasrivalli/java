package com.hcl.day4;

public class Quiz {
	static int score;
	public void incr() {
		score++;
	}

	@Override
	public String toString() {
		return "Quiz [score=" + score +"]";
	}

	public static void main(String[] args) {
		Quiz obj1 = new Quiz();
		obj1.incr();
		System.out.println(obj1);
		Quiz obj2 = new Quiz();
		obj2.incr();
		System.out.println(obj2);
		Quiz obj3 = new Quiz();
		obj3.incr();
		System.out.println(obj3);
	}
	

}
