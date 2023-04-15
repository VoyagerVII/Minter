package Minter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankingTestBalance extends Bankaccount {
	Bankaccount Test = new Bankaccount();
	@Test
	public void test() {

		Test.Balance(500, 0,0, 0); 
		System.out.printf(" Test 1 Running: Balance Functions test \n");
		Test.UserBalance.showBalance();
		Test.UserBalance.setDeposit(300);
		assertEquals(Test.UserBalance.getBalance(),800,2);
		System.out.printf("Deposit test passed :\n");
		Test.UserBalance.showBalance();
		Test.UserBalance.setWithdrawal(300);
		assertEquals(Test.UserBalance.getBalance(),500,2);
		System.out.printf("Withdrawal test passed :\n");
		Test.UserBalance.showBalance();
		Test.UserBalance.setSpending(100);
		assertEquals(Test.UserBalance.getBalance(),200,2);
		System.out.printf("Spending test passed :\n");		
		Test.UserBalance.showBalance();
		Test.UserBalance.setBalance(1000);
		assertEquals(Test.UserBalance.getBalance(),1000,1);
		System.out.printf("Total Balance test passed :\n");
		System.out.printf("Final Balance: ");
		Test.UserBalance.showBalance();
	
	}

}
