package Minter;

public class Bankaccount {
	protected Account UserInfo;
	protected Balance UserBalance;
	protected Authentication UserAuth;

public Bankaccount()
{}
void Balance(double deposit, double withdrawal, double spending, double balance) {
    this.UserBalance = new Balance(deposit,withdrawal,spending,balance);
}
void Account(String username, String email, String password, String fullName) {
    this.UserInfo = new Account (username,email,password,fullName);
}
void Authentication(String username, String email, String password, String fullName,String key) {
	this.UserAuth = new Authentication(username,email,password,fullName,key);
}
} 
 
