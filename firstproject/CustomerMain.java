package com.hcl.firstproject;

import java.util.List;
import java.util.Scanner;

public class CustomerMain {
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("__________");
			System.out.println("1.Add Customer");
			System.out.println("2.Show Customer");
			System.out.println("3.Search Customer");
			System.out.println("4.Update Customer");
			System.out.println("5.Delete Customer");
			System.out.println("6. Write Student File");
			System.out.println("7. Read Student File");
			System.out.println("8. Exit");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 :
				updateCustomer();
				break;
			case 5 :
				deleteCustomer();
				break;
			case 6 : 
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile();
				break;
			case 8 :
				return;
			default :
				System.out.println("INvalid Inputs");
			}
			
		} while(choice != 6);
		
	}
	
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	public static void updateCustomer() {
		Customer objcustomer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID ");
		objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer name ");
		objcustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual premium..");
		objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal Premium.");
		objcustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter payment mode..");
		objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		
		CustomerBAL obj = new CustomerBAL();
		System.out.println(obj.updateCustomerBAL(objcustomer));
	}
	public static void deleteCustomer() {
		int custId;
		System.out.println("Enter Customer Id");
		Scanner sc = new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj = new CustomerBAL();
		System.out.println(obj.deleteCustomerBAL(custId));
	}
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer ID :");
		Scanner sc = new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj = new CustomerBAL();
		Customer customer = obj.searchCustomerBAL(custId);
		if(customer == null) {
			System.out.println("Customer record not found...");
		} else {
			System.out.println(customer);
		}
	}
	public static void showCustomer() {
		CustomerBAL obj = new CustomerBAL();
		List<Customer> customers = obj.showCustomerBAL();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	public static void addCustomer() {
		Customer objcustomer =new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id");
		objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer name");
		objcustomer.setCustName(sc.nextLine());
		System.out.println("Enter Annual premium..");
		objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Modal premium..");
		objcustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter paymentmode..");
		objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		
		CustomerBAL obj = new CustomerBAL();
		try {
			boolean res = obj.addCustomerBAL(objcustomer);
			if(res == true) {
				System.out.println("Customer added successfully....");
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
