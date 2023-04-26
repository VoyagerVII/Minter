package Minter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTestAuthentication extends Bankaccount {
	
	Bankaccount test4 = new Bankaccount();
	
	@Test
	public void test() {
		
		System.out.printf("Test 4: Running Authentication class Test");
		test4.Account("Cmedrano6", "cm6693916", "123Password**","Chrisian Medrano");
		
		test4.Authentication("cmedrano6", "cm6693916@gmail.com","123Password**", "Christian Medrano", "1");
		
		test4.UserInfo.login("cmedrano6", "123Password**");
		
	
		
	}

}
