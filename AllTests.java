package Minter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BankingTestBalance.class,
	BankingTestAccount.class,
	BankingTestLogin.class, 
	BankingTestAuthentication.class,
	BankingTestminterInterface.class
	})
public class AllTests {

}
