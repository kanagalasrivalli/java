package com.hcl.firstproject;

import java.util.List;


public class CustomerBAL {
	
	static StringBuilder sb = new StringBuilder();
	
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBAL(Customer objcustomer) throws CustomerException{
		boolean isAdded = true;
		if(objcustomer.getCustId() <= 0) {
			sb.append("Customer ID cannot be negative or zero..\r\n");
			isAdded = false;
		}if(objcustomer.getCustName().length() <= 5) {
			sb.append("Name length should be greater than 5 characters..\r\n");
			isAdded = false;
		}if(objcustomer.getAnnualPremium() < 20000 || objcustomer.getAnnualPremium() >1000000 ) {
			sb.append("Annual premium should be in between 20,000 and 10,00,000..\r\n");
			isAdded = false;
		}if(objcustomer.getModalPremium() < 1000 || objcustomer.getModalPremium() >50000 ) {
			sb.append("Modal premium should be in between 1000 and 50,000..\r\n");
			isAdded = false;
		}if(objcustomer.getPaymentMode() < 1 || objcustomer.getPaymentMode() > 3 ) {
			sb.append("Paymentmode should be either 1,2 or 3..\r\n");
			isAdded = false;
		}
		if(isAdded == false) {
			throw new CustomerException(sb.toString());	 
		}else {
			new CustomerDAO().addCustomerDAO(objcustomer);
		}
		return isAdded;
	}
	public List<Customer> showCustomerBAL() {
		
		return new CustomerDAO().showCustomerDAO();
	}
	public Customer searchCustomerBAL(int custId) {
		
		return new CustomerDAO().searchCustomerDAO(custId);
	}
	public String updateCustomerBAL(Customer objcustomer) {
		return new CustomerDAO().updateCustomerDAO(objcustomer);
	}
	public String deleteCustomerBAL(int custId) {
		return new CustomerDAO().deleteCustomerDAO(custId);
	}
	
	
}
