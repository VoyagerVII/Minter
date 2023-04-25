//BankingTestAccount.java
//04/25/2023
//Creates a banking test account

package Minter;

import static org.junit.Assert.*;

import org.junit.Test;
//Bank account that tests extends Bankaccount
public class BankingTestAccount extends Bankaccount {
	Bankaccount test = new Bankaccount();
	@Test
	public void test() {
		System.out.printf("Test 2: Running AccountClassTest");
		  //tests to see if creating an account passes system tests
		test.Account("Chrismedr", "cmedrano6@islander", "12PWQE34**", "Christian Medrano");
		assertEquals(test.UserInfo.getEmail(),"cmedrano6@islander");
		//email test
		System.out.printf("Email Test Passed: \n");
		//username test
		assertEquals(test.UserInfo.getUsername(),"Chrismedr");
		System.out.printf("Password Test Passed: \n");
		//full name test
		assertEquals(test.UserInfo.getFullName(),"Christian Medrano");
		System.out.printf("Full name Test Passed: \n");
		//password test
		assertEquals(test.UserInfo.getPassword(),"12PWQE34**");
		System.out.printf("Password Test Passed: \n");
		//system outputs if the test passes
		
	}

}

