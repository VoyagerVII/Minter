//Balance.java
//04/25/2023
//helps to display the balance

package Minter;

public class Balance extends Bankaccount {
		private double deposit;
	    private double withdrawal;
	    private double spending;
	    private double balance;
//sets the balance and performs error checking
	    public Balance(double deposit, double withdrawal, double spending, double balance) {
	    	if (deposit<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	if (balance<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	if (withdrawal<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	if (spending<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	this.deposit = deposit;
	        this.withdrawal = withdrawal;
	        this.spending = spending;
	        this.balance = balance + deposit - withdrawal - spending;
	    }
	    // Getters and setters
	    public double getDeposit() {
	        return deposit;
	    } 
	   //sets the deposit
	    public void setDeposit(double deposit) {
	    	if (deposit<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	if (deposit<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	this.deposit = deposit;
	        this.balance += deposit;
	    }
	  //gets the withdrawal
	    
	    public double getWithdrawal() {
	        return withdrawal;
	    }
	   
	    //sets the withdrawal
	    public void setWithdrawal(double withdrawal) {
	    	if (withdrawal<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    	
	    	this.withdrawal = withdrawal;
	        this.balance -= deposit;

	    }
	   //gets the spending of the user
	    
	    public double getSpending() {
	        return spending;
	    }
	    
	    //sets the users spending and error checks plus updates the balance
	    public void setSpending(double spending) {
	    	if (spending<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	    
	        this.spending = spending;
	        this.balance -= deposit;

	    }
	    
	   //returns the users balance
	    
	    public double getBalance() {
	        return balance;
	    }
	    
	    //sets the users balance
	    public void setBalance(double balance) {
	    	if (balance<0)
	        {
	        	throw new IllegalArgumentException ("Input must be valid");
	        }
	        this.balance = balance;
	    }
   //displays the current users balance
	    public void showBalance() {
	        System.out.println("Current balance: $" + this.balance);
	    }
	}
