package com.hcl.day4;

public class Timezone {
	
	int hr;
	int mi;
	
	public Timezone(){
		hr=3;
		mi=40;
	}
	
	public Timezone Addtime(Timezone T1,Timezone T2) {
		Timezone T3=new Timezone();
		T3.hr=T1.hr+T2.hr;
		T3.mi=T1.mi+T2.mi;
		if (T3.mi>=60){
			T3.hr++;
			T3.mi=(T3.mi)%60;
		}
	    return T3;
	}


	public Timezone(int hr, int mi) {
		super();
		this.hr = hr;
		this.mi = mi;
	}
	
	@Override
	public String toString() {
		return "Timezone [hr=" + hr + "hours, mi=" + mi + "minutes]";
	}


}
