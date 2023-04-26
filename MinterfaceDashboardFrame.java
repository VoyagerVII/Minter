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
     private final JButton UserProfile;
     
     private final JTextField Amount;
     
     private final JLabel Transactions;
     
     private final JLabel Userinformation;
     private final JPanel UserinfoPanel;
     
     public MinterfaceDashboardFrame(final Bankaccount bankuser) {
    	 
    	 super("User Dashboard");
    	 
         getContentPane().setBackground(Color.white);

    	 
    	 setLayout(new FlowLayout());
    	 
    	 transactionHistory = new ArrayList<>();
    	 
         Confirmation = new JButton("Confirm");
         Logout = new JButton("Logout");
         UserProfile = new JButton("User Profile");
         
    	 AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
         AccountDepositJRadioButton = new JRadioButton("Deposit"); 
         
         TransactionsLabel = new JPanel();
         ConfirmationLabel = new JPanel();
         UserinfoPanel = new JPanel();
         
         //
         UserChoice = new JPanel();
         
         Amount = new JTextField(20);
         
         Transactions = new JLabel("<html>Bank Account Transactions Log: <br>"
         		+ "<html>Balance: "+bankuser.UserBalance.getBalance() + "<html><br>"
         		+ "<html>Deposits: "+bankuser.UserBalance.getDeposit() + "<html><br>"
         		+ "<html>Withdraws: " +bankuser.UserBalance.getWithdrawal() + "<html><br>"
        		 +"<html><br>");
         Userinformation = new JLabel( "<html>Bank Account User Information: <br>"
           		+ "<html>Username: "+bankuser.UserInfo.getUsername() + "<html><br>"
           		+ "<html>Password: "+bankuser.UserInfo.getPassword() + "<html><br>"
           		+ "<html>Name: "+bankuser.UserInfo.getFullName() + "<html><br>"
                 + "<html>Email: "+bankuser.UserInfo.getEmail() + "<html><br>"
           		+ "<html>Balance: "+bankuser.UserBalance.getBalance() + "<html><br>"
                 + "<html>Deposits: "+bankuser.UserBalance.getDeposit() + "<html><br>"
                 + "<html>Withdraws: " +bankuser.UserBalance.getWithdrawal() + "<html><br>"
                 +"<html><br>");
        		 
        		 
        		 
         Userinformation.setVisible(false);
        		 
        		 
         TransactionsLabel.add(AccountWithdrawalJRadioButton);
         TransactionsLabel.add(AccountDepositJRadioButton);
         TransactionsLabel.add(Amount);
         
         AccountTransactions = new ButtonGroup();
         AccountTransactions.add(AccountWithdrawalJRadioButton);
         AccountTransactions.add(AccountDepositJRadioButton);
    	 
         ConfirmationLabel.add(TransactionsLabel);
         ConfirmationLabel.add(Confirmation);
         ConfirmationLabel.add(Transactions);
         UserinfoPanel.add(Userinformation);

         add(ConfirmationLabel);
         
         UserChoice.add(UserProfile);
         UserChoice.add(Logout);
         add(UserChoice);
         add(UserinfoPanel);
         
         Logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			
			}

        	 
         });
         UserProfile.addActionListener(new ActionListener() {

 			@Override
 			public void actionPerformed(ActionEvent e) {
 		         Userinformation.setVisible(true);
 		        Userinformation.setText(
 		        "<html>Bank Account User Information: <br>"
          		+ "<html>Username: "+bankuser.UserInfo.getUsername() + "<html><br>"
          		+ "<html>Password: "+bankuser.UserInfo.getPassword() + "<html><br>"
          		+ "<html>Name: "+bankuser.UserInfo.getFullName() + "<html><br>"
                + "<html>Email: "+bankuser.UserInfo.getEmail() + "<html><br>"
          		+ "<html>Balance: "+bankuser.UserBalance.getBalance() + "<html><br>"
                + "<html>Deposits: "+bankuser.UserBalance.getDeposit() + "<html><br>"
                + "<html>Withdraws: " +bankuser.UserBalance.getWithdrawal() + "<html><br>"
                +"<html><br>");
 			
 			}

         	 
          });

         Confirmation.addActionListener(new ActionListener() {
         	
 			public void actionPerformed(ActionEvent e) {
 				
 				if(e.getSource()==Confirmation)
 				{
	 	 				String amount = Amount.getText();
 		 		        double amountDouble = Double.parseDouble(amount);
 						
 					String transactionDetails = "";
 					
 					if(AccountWithdrawalJRadioButton.isSelected())
 					{
 		 		        
 		 		        
 		 		        transactionDetails = "Withdrawal: " + amountDouble;
 		 				
 		 		        bankuser.UserBalance.setWithdrawal(amountDouble);
 		 		        
 		 		     // if(amountDouble!=bankuser.UserBalance.getWithdrawal())
		 		        	//amountDouble = bankuser.UserBalance.getWithdrawal();
 		 		      
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Withdrawal: "+ bankuser.UserBalance.getWithdrawal() );
						

 					}	
 					if(AccountDepositJRadioButton.isSelected())
 					{
 		 		        
 		 		        transactionDetails = "Deposit: " + amountDouble;
 		 		        
 		 				bankuser.UserBalance.setDeposit(amountDouble);
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Deposit: "+ bankuser.UserBalance.getDeposit() );	 

 					}
 						
 					transactionHistory.add(transactionDetails);
 					Transactions.setText("<html>Bank Account Transactions Log: <br>"
				            + "<html>Balance: "+bankuser.UserBalance.getBalance() + "<html><br>"
				            + "<html>Deposits: "+bankuser.UserBalance.getDeposit() + "<html><br>"
				            + "<html>Withdraws: " +bankuser.UserBalance.getWithdrawal() + "<html><br>"
				            +"<html><br>");
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
