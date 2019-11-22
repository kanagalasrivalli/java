package com.hcl.day4;

public class Ebill {
	public void check(int units,double billpay,int b1, double b2, double b3, double b4, double b5,double b6) {
		if(units <= 100) {
			billpay=units * b1;
		}else if(units >100 && units <=150) {
			billpay = 100 *b1 + (units-100)*b2 ;
		
		}else if(units >150 && units <=200) {
			billpay = 100 *b1 + 50*b2 + (units-150)*b3 ;
		
		}else if(units >200 && units <=250) {
			billpay = 100 *b1 + 50*b2 + 50*b3 + (units-200)*b4;
		
		}else if(units >250 && units <=300) {
			billpay = 100 *b1 + 50*b2 + 50*b3 + 50*b4 + (units-250)*b5;
		
		}else {
			billpay = 100 *b1 + 50*b2 + 50*b3 + 50*b4 + 50*b5 + (units-300)*b6;
		
		}
		System.out.println("Electricity bill " +billpay);
	}
	public static void main(String[] args) {
		int units=200;
		double billpay=0;
		int b1=1;
		double b2=2.2;
		double b3=3.4;
		double b4=3.6;
		double b5=6.6;
		double b6=7.4;
		new Ebill().check(units, billpay, b1, b2, b3, b4, b5, b6);
	}

}
