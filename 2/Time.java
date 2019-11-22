package com.hcl.day4;

public class Time {
	public static void main(String[] args) {
		Timezone T1=new Timezone();
		System.out.println(T1);
		Timezone T2=new Timezone(4,30);
		System.out.println(T2);
		Timezone T=new Timezone().Addtime(T1, T2);	
		System.out.println("Timezone oo [hr=" + T.hr + "hours, mi=" + T.mi + "minutes]");
	}

}
