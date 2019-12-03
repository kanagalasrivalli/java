package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	

		Connection con;
		PreparedStatement pst;

		public String withdrawAccount(int accountno,int withdrawAmount) {
		con = DaoConnection.getConnection();
		String result = "";
		Account account = searchaccount(accountno);
		if(account != null) {
		int amount = account.getAmount();
		if(amount-withdrawAmount >= 1000) {
		String cmd = " update Accounts set Amount = Amount-? "
		+ " Where AccountNo= ? ";
		try {
		pst=con.prepareStatement(cmd);
		pst.setInt(1, withdrawAmount);
		pst.setInt(2, accountno);
		pst.executeUpdate();
		cmd = " insert into Trans(AccountNo,TransAmount, "
		+ "TransType) values(?,?,?) ";
		pst=con.prepareStatement(cmd);
		pst.setInt(1, accountno);
		pst.setInt(2, withdrawAmount);
		pst.setString(3, "D");
		pst.executeUpdate();
		result = "Amount debited...";
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}else {
		result = "Insufficient funds...";
		}
		}else{
		result = "Account not found..";
		}
		return result;
		}

		public String depositAccount(int accountNo,int depositAmount) {
		con = DaoConnection.getConnection();
		String result = "";
		String cmd = " update Accounts set Amount=Amount+? "
		+ " where AccountNo=? ";
		try {
		pst=con.prepareStatement(cmd);
		pst.setInt(1, depositAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = " insert into trans(AccountNo,TransAmount,TransType) values(?,?,?) ";
		pst=con.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setInt(2, depositAmount);
		pst.setString(3, "C");
		pst.executeUpdate();
		result="Amount credited...";

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return result;
		}

		public String closeAccount(int accountno) {
		con = DaoConnection.getConnection();
		String result = "";
		String cmd = " update Accounts set status='inactive' "
		+ " where AccountNo=? ";
		try {
		pst =con.prepareStatement(cmd);
		pst.setInt(1, accountno);
		pst.executeUpdate();
		result = "account closed...";
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		result = e.getMessage();
		e.printStackTrace();
		}

		return result;
		}

		public String updateaccount(String city,String state,int accountno) {
		con = DaoConnection.getConnection();
		String result = "";
		String cmd = " update Accounts set city=? , state =? "
		+ " where AccountNo=? ";
		try {
		pst = con.prepareStatement(cmd);
		pst.setString(1, city);
		pst.setString(2, state);
		pst.setInt(3, accountno);
		pst.executeUpdate();
		result = "account updated....";

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		result=e.getMessage();
		e.printStackTrace();
		}
		return result;
		}

		public Account searchaccount(int accountno) {
		con = DaoConnection.getConnection();
		Account account = null;
		String cmd = " Select * from Accounts where AccountNO = ? ";
		try {
		pst = con.prepareStatement(cmd);
		pst.setInt(1, accountno);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
		account = new Account();
		account.setAccountNo(rs.getInt("accountNo"));
		account.setFirstName(rs.getString("firstname"));
		account.setLastName(rs.getString("lastname"));
		account.setCity(rs.getString("city"));
		account.setState(rs.getString("state"));
		account.setAmount(rs.getInt("amount"));
		account.setCheqFacil(rs.getString("CheqFacil"));
		account.setAccountType(rs.getString("Accounttype"));

		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return account;
		}

		public List<Account> showAccount() {
		con = DaoConnection.getConnection();
		String cmd = " select * from Accounts ";
		List<Account> acclist= new ArrayList<Account>();
		Account account = null;
		try {
		pst=con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		account = new Account();
		account.setFirstName(rs.getString("lastname"));
		account.setCity(rs.getString("city"));
		account.setState(rs.getString("state"));
		account.setAmount(rs.getInt("amount"));
		account.setCheqFacil(rs.getString("CheqFacil"));
		account.setAccountType(rs.getString("accounttype"));
		acclist.add(account);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return acclist;

		}

		public String createAccount(Account account) {
		con = DaoConnection.getConnection();
		String cmd = " insert into Accounts(AccountNo,FirstName,LastName,City,State,Amount,CheqFacil,AccountType) " +
		" values(?,?,?,?,?,?,?,?) ";
		String result = "";
		try {
		pst=con.prepareStatement(cmd);
		pst.setInt(1,account.getAccountNo());
		pst.setString(2, account.getFirstName());
		pst.setString(3, account.getLastName());
		pst.setString(4, account.getCity());
		pst.setString(5, account.getState());
		pst.setInt(6, account.getAmount());
		pst.setString(7, account.getCheqFacil());
		pst.setString(8, account.getAccountType());
		pst.executeUpdate();
		result ="Account details added successfully.." ;


		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return result;
		}
		public int generateAccNo() {
		con = DaoConnection.getConnection();
		String cmd = " select case when max(AccountNo) is null then 1 " +
		" else max(AccountNo)+1 end AccountNo from Accounts ";
		int accountno = 0;
		try {
		pst=con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		accountno=rs.getInt("AccountNo");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return accountno;
		}

		}




