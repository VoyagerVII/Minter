package Minter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTestAuthentication extends Bankaccount {
	
	Bankaccount test = new Bankaccount();
	
	@Test
	public void test() {
		
		System.out.printf("Test 4: Running Authentication class Test");
		test.Account("Cmedrano6", "cm6693916", "123Password**","Chrisian Medrano");
		
		test.Authentication("cmedrano6", "cm6693916@gmail.com","123Password**", "Christian Medrano", "1");
		
		test.UserAuth.login("cmedrano6", "123Password**");
			
		test.UserAuth.hash(test.UserInfo.getPassword());

		System.out.printf("Testing hash key: %n" + test.UserAuth.getKey());
		
		
		System.out.printf("Testing hash table: %n" + test.UserAuth.getHashTable() + "\n");
		
	}

}
