//Account.java
//04/25/2023
//This will store the account information
package Minter;
//helps the user to create their bank account
public class Account extends Bankaccount {
	private String username;
    private String email;
    private String password;
    private String fullName;
//stores the username, email,password, and name
    public Account(String username, String email, String password, String fullName) {
    	this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;

    }
  //checks to see if the log in information matches anything stored
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
        	return false;
        }
    }
//gets the username
    public String getUsername() {
        return username;
    }
//gets the email
    public String getEmail() {
        return email;
    }
//gets the password
    public String getPassword() {
        return password;
    }
//gets the full name
    public String getFullName() {
        return fullName;
    }
// sets the username
    public void setUsername(String username) {
    	if (username==null)
        {
        	throw new IllegalArgumentException ("Input must be valid");
        }
    	this.username = username;
    }
//sets the email for the account
    public void setEmail(String email) {
        if (email==null)
        {
        	throw new IllegalArgumentException ("Input must be valid");
        }
    	this.email = email;
    }
//sets the password for the account
    public void setPassword(String password) {
        if (password==null)
        {
        	throw new IllegalArgumentException ("Must be a valid input");
        }
    	this.password = password;
    }}

