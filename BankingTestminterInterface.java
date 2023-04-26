package Minter;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankingTestminterInterface extends Bankaccount{
	Bankaccount test = new Bankaccount();
	
	@Test
	public void test() {
		System.out.printf("Test 5: Running Login Test");
		
		//ACCOUNT
		test.Account("Chrismedr", "cmedrano6@islander", "12PWQE34**", "Christian Medrano");
		assertEquals(test.UserInfo.getEmail(),"cmedrano6@islander");
		System.out.printf("Email Test Passed: \n");
		assertEquals(test.UserInfo.getUsername(),"Chrismedr");
		System.out.printf("Password Test Passed: \n");
		assertEquals(test.UserInfo.getFullName(),"Christian Medrano");
		System.out.printf("Full name Test Passed: \n");
		assertEquals(test.UserInfo.getPassword(),"12PWQE34**");
		System.out.printf("Password Test Passed: \n");

		
		// BALANCE
		test.Balance(500, 0,0, 0); 
		test.UserBalance.showBalance();
		test.UserBalance.setDeposit(300);
		assertEquals(test.UserBalance.getBalance(),800,2);
		System.out.printf("Deposit test passed :\n");
		test.UserBalance.showBalance();
		test.UserBalance.setWithdrawal(300);
		assertEquals(test.UserBalance.getBalance(),500,2);
		System.out.printf("Withdrawal test passed :\n");
		test.UserBalance.showBalance();
		test.UserBalance.setSpending(100);
		assertEquals(test.UserBalance.getBalance(),200,2);
		System.out.printf("Spending test passed :\n");		
		test.UserBalance.showBalance();
		test.UserBalance.setBalance(1000);
		assertEquals(test.UserBalance.getBalance(),1000,1);
		System.out.printf("Total Balance test passed :\n");
		System.out.printf("Final Balance: ");
		test.UserBalance.showBalance();
		
		// LOG-IN
		System.out.printf("Login Test Result : ");
		assert(test.UserInfo.login("Chrismedr", "12PWQE34**"));
		System.out.printf("Succesful\n");
		
		
	}
	
	
}