package Minter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTestAccount extends Bankaccount {
	Bankaccount test = new Bankaccount();
	@Test
	public void test() {
		System.out.printf("Test 2: Running AccountClassTest");
		  
		test.Account("Chrismedr", "cmedrano6@islander", "12PWQE34**", "Christian Medrano");
		assertEquals(test.UserInfo.getEmail(),"cmedrano6@islander");
		System.out.printf("Email Test Passed: \n");
		assertEquals(test.UserInfo.getUsername(),"Chrismedr");
		System.out.printf("Password Test Passed: \n");
		assertEquals(test.UserInfo.getFullName(),"Christian Medrano");
		System.out.printf("Full name Test Passed: \n");
		assertEquals(test.UserInfo.getPassword(),"12PWQE34**");
		System.out.printf("Password Test Passed: \n");
		
		
	}

}
