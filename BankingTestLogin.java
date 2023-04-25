//BankingTestLogin.java
//04/25/2023
//Tests to see if the user can login correctly 


package Minter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTestLogin extends Bankaccount {
	Bankaccount test = new Bankaccount();
//runs the login test
	@Test
	public void test() {
		//tests using the information provided
		System.out.printf("Test 3: Running Login Test");
		test.Account("Chrismedr", "cmedrano6@islander", "12PWQE34**", "Christian Medrano");
		System.out.printf("Login Test Result : ");
		assert(test.UserInfo.login("Chrismedr", "12PWQE34**"));
		System.out.printf("Succesful\n");
		
	}
	

}

