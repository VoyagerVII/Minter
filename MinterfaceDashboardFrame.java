package Minter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinterfaceDashboardFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	// TRANSACTIONS
     private final JPanel TransactionsLabel;
     private final JPanel ConfirmationLabel;
     private final JRadioButton AccountWithdrawalJRadioButton;
     private final JRadioButton AccountDepositJRadioButton;
     private final ButtonGroup AccountTransactions;
     private final JButton Confirmation;
     private final JTextField Amount;
     private final JLabel Transactions;
     
     public MinterfaceDashboardFrame(final Bankaccount bankuser) {
    	 
    	 super("User Dashboard");
    	 
    	 
    	 
         Confirmation = new JButton("Confirm");
    	 AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
         AccountDepositJRadioButton = new JRadioButton("Deposit"); 
         TransactionsLabel = new JPanel();
         ConfirmationLabel = new JPanel();
         Amount = new JTextField(20);
         Transactions = new JLabel("Bank Account Transactions Log: \n"
         		+ ":Balance "+bankuser.UserBalance.getBalance()
         		+ "\n:Deposits "+bankuser.UserBalance.getDeposit()
         		+ "\n:Withdraws "+bankuser.UserBalance.getWithdrawal()
        		 +"\n");
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
         
         Confirmation.addActionListener(new ActionListener() {
         	
 			public void actionPerformed(ActionEvent e) {
 				
 				if(e.getSource()==Confirmation)
 				{
 					if(AccountWithdrawalJRadioButton.isSelected())
 					{
 		 				String Withdrawal = Amount.getText();
 		 		        double amountDouble = Double.parseDouble(Withdrawal);
 		 				bankuser.UserBalance.setWithdrawal(amountDouble);
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Withdrawal: "+ bankuser.UserBalance.getWithdrawal() );

 					}	
 					if(AccountDepositJRadioButton.isSelected())
 					{
 						
 		 				String Deposit = Amount.getText();
 		 		        double amountDouble = Double.parseDouble(Deposit);
 		 				bankuser.UserBalance.setDeposit(amountDouble);
						JOptionPane.showMessageDialog(Confirmation, "Deposited successfully: "+"Deposit: "+ bankuser.UserBalance.getDeposit() );
						 

 					}

 				}
 				
 				
 				
 			dispose();
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
