//Bankaccount.java
//04/25/2023
//Helps authenticate the bank account by checking the user account validity
package Minter;

import javax.naming.AuthenticationException;

//private members allow the class to use these variables
public class Bankaccount {
	protected Account UserInfo;
	protected Balance UserBalance;
	protected AuthenticationException UserAuth;
public Bankaccount()
{
	

}

//sets the current users balance according to his deposit withdrawal spending and current balance
void Balance(double deposit, double withdrawal, double spending, double balance) {
    this.UserBalance = new Balance(deposit,withdrawal,spending,balance);
}

//allow current user to have their information stored
void Account(String username, String email, String password, String fullName) {
    this.UserInfo = new Account (username,email,password,fullName);
}

//allows user authenticator to be for the selected user
void Authentication(String username, String email, String password, String fullName,String key) {
	this.UserAuth = new AuthenticationException(username);
}
} 
