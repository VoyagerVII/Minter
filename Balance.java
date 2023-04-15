package Minter;

public class Balance extends Bankaccount {
		private double deposit;
	    private double withdrawal;
	    private double spending;
	    private double balance;

	    public Balance(double deposit, double withdrawal, double spending, double balance) {
	        this.deposit = deposit;
	        this.withdrawal = withdrawal;
	        this.spending = spending;
	        this.balance = balance + deposit - withdrawal - spending;
	    }
	    // Getters and setters
	    public double getDeposit() {
	        return deposit;
	    } 
	    public void setDeposit(double deposit) {
	        this.deposit = deposit;
	        this.balance += deposit;
	    }
	    public double getWithdrawal() {
	        return withdrawal;
	    }
	    public void setWithdrawal(double withdrawal) {
	        this.withdrawal = withdrawal;
	        this.balance -= deposit;

	    }
	    public double getSpending() {
	        return spending;
	    }
	    public void setSpending(double spending) {
	        this.spending = spending;
	        this.balance -= deposit;

	    }
	    public double getBalance() {
	        return balance;
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void showBalance() {
	        System.out.println("Current balance: $" + this.balance);
	    }
	}
