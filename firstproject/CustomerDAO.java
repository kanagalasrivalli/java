package com.hcl.firstproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer> lstCustomer = null;
	static {
		lstCustomer = new ArrayList<Customer>();
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstCustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstCustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String addCustomerDAO(Customer customer) {
		lstCustomer.add(customer);
		return "Customer record created successfully..";
	}
	public List<Customer> showCustomerDAO() {
		return lstCustomer;
	}
	public Customer searchCustomerDAO(int custId) {
		Customer objcustomer = null;
		for (Customer customer : lstCustomer) {
			if(customer.getCustId() == custId) {
				objcustomer = customer;
			}
		}
		return objcustomer;
	}
	public String deleteCustomerDAO(int custId) {
		String result ="";
		Customer customer = searchCustomerDAO(custId);
		if (customer != null) {
			lstCustomer.remove(customer);
			result = "Student record deleted successfully..";
		} else {
			result = "Student record not found..";
		}
		
		return result;
	}
	public String updateCustomerDAO(Customer objcustomer) {
		String result;
		Customer customer = searchCustomerDAO(objcustomer.getCustId());
		if (customer != null) {
			for (Customer c : lstCustomer) {
				if(c.getCustId()==objcustomer.getCustId()) {
					c.setCustName(objcustomer.getCustName());
					c.setAnnualPremium(objcustomer.getAnnualPremium());
					c.setModalPremium(objcustomer.getModalPremium());
					c.setPaymentMode(objcustomer.getPaymentMode());
				}	
			}
			result = "Customer record updated..";
		} else {
			result = "Customer record not found..";
		}
		
		return result;
	}
}
