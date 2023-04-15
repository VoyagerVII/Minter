package Minter;

public class minterInterface extends Bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount Christian = new Bankaccount();

	
	Christian.Account("Cmedrano6", "cm6693916", "123Password**","Chrisian Medrano");
	System.out.printf("Account Creation test passed\n");
	Christian.Balance(500, 0, 30, 90.05);
	Christian.UserBalance.showBalance();
	Christian.UserBalance.setDeposit(300);
	System.out.printf("Deposit test passed ");
	Christian.UserBalance.showBalance();
	Christian.UserBalance.setWithdrawal(300);
	System.out.printf("Withdrawal test passed ");
	Christian.UserBalance.showBalance();
	Christian.UserBalance.setSpending(200);
	System.out.printf("Spending test passed ");		
	Christian.UserBalance.showBalance();
	Christian.UserBalance.setBalance(1000);
	System.out.printf("Total Balance test passed \n");
	System.out.printf("Final Balance: ");
	Christian.UserBalance.showBalance();
	
	Christian.Authentication("cmedrano6", "cm6693916@gmail.com","123Password**", "Christian Medrano", "1");
	
	}
}
 