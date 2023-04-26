package Minter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MinterfaceDashboardFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final ArrayList<String> transactionHistory;
	
	// TRANSACTIONS
     private final JPanel TransactionsLabel;
     private final JPanel ConfirmationLabel;
     private final JPanel UserChoice;
     
     private final JRadioButton AccountWithdrawalJRadioButton;
     private final JRadioButton AccountDepositJRadioButton;
     
     private final ButtonGroup AccountTransactions;
     
     private final JButton Confirmation;
     private final JButton Logout;
     
     private final JTextField Amount;
     
     private final JLabel Transactions;
     
     public MinterfaceDashboardFrame(final Bankaccount bankuser) {
    	 
    	 super("User Dashboard");
    	 
    	 transactionHistory = new ArrayList<>();
    	 
         Confirmation = new JButton("Confirm");
         Logout = new JButton("Logout");
         
    	 AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
         AccountDepositJRadioButton = new JRadioButton("Deposit"); 
         
         TransactionsLabel = new JPanel();
         ConfirmationLabel = new JPanel();
         UserChoice = new JPanel();
         
         Amount = new JTextField(20);
         
         Transactions = new JLabel("<html>Bank Account Transactions Log: <br>"
         		+ "<html>Balance: "+bankuser.UserBalance.getBalance() + "<html><br>"
         		+ "<html>Deposits: "+bankuser.UserBalance.getDeposit() + "<html><br>"
         		+ "<html>Withdraws: " +bankuser.UserBalance.getWithdrawal() + "<html><br>"
        		 +"<html><br>");
         
         TransactionsLabel.add(AccountWithdrawalJRadioButton);
         TransactionsLabel.add(AccountDepositJRadioButton);
         TransactionsLabel.add(Amount);
         
         AccountTransactions = new ButtonGroup();
         AccountTransactions.add(AccountWithdrawalJRadioButton);
         AccountTransactions.add(AccountDepositJRadioButton);
    	 
         ConfirmationLabel.add(TransactionsLabel);
         ConfirmationLabel.add(Confirmation);
         ConfirmationLabel.add(Transactions);
         add(ConfirmationLabel);
         
         UserChoice.add(Logout);
         Logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				dispose();
			}

        	 
         });
         
         add(UserChoice);
         
         
         Confirmation.addActionListener(new ActionListener() {
         	
 			public void actionPerformed(ActionEvent e) {
 				
 				if(e.getSource()==Confirmation)
 				{
 					String transactionDetails = "";
 					
 					if(AccountWithdrawalJRadioButton.isSelected())
 					{
 		 				String Withdrawal = Amount.getText();
 		 		        double amountDouble = Double.parseDouble(Withdrawal);
 		 		        
 		 		        transactionDetails = "Withdrawal: " + amountDouble;
 		 				
 		 		        bankuser.UserBalance.setWithdrawal(amountDouble);
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Withdrawal: "+ bankuser.UserBalance.getWithdrawal() );

 					}	
 					if(AccountDepositJRadioButton.isSelected())
 					{
 						
 		 				String Deposit = Amount.getText();
 		 		        double amountDouble = Double.parseDouble(Deposit);
 		 		        
 		 		        transactionDetails = "Deposit: " + amountDouble;
 		 		        
 		 				bankuser.UserBalance.setDeposit(amountDouble);
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Deposit: "+ bankuser.UserBalance.getDeposit() );
						 

 					}
 						
 					transactionHistory.add(transactionDetails);
 				}
 			}			
         	
         });

         setSize(684,412);
         setVisible(true);
     }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
