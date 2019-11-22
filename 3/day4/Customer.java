package com.hcl.day4;

public class Customer {
	int custId;
	String name;
	String city;
	double premium;
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", city="
				+ city + ", premium=" + premium + "]";
	}

	public Customer(int custId, String name, String city, double premium) {
		super();
		this.custId = custId;
		this.name = name;
		this.city = city;
		this.premium = premium;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer Cust = (Customer)obj;
		if(Cust.city == city){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int custId = 12344;
		String name = "Tejasree";
		String city = "Chennai";
		double premium = 123.34555;
		
		Customer c = new Customer(custId, name, city, premium);
		//System.out.println(C);
	
		Customer c1 = new Customer(12345,"siri","Chennai", 1234.4568);
		Customer c2 = new Customer(12346,"sweth","KAdap", 1238.4568);
		Customer [] arr = {c,c1,c2};
		for (Customer customer : arr) {
			System.out.println(customer);
		}
		
		System.out.println(c1.equals(c2));
		
		
		
		
		
	}
}
