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
     private final JRadioButton AccountWithdrawalJRadioButton;
     private final JRadioButton AccountDepositJRadioButton;
     private final ButtonGroup AccountTransactions;
     private final JButton Confirmation;
     private final JTextField Amount;
     
     public MinterfaceDashboardFrame(final Bankaccount bankuser) {
    	 
    	 super("User Dashboard");
    	 
    	 
    	 
    	 
    	 AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
         AccountDepositJRadioButton = new JRadioButton("Deposit"); 
         TransactionsLabel = new JPanel();
         
         Amount = new JTextField(8);
         
         TransactionsLabel.add(AccountWithdrawalJRadioButton);
         TransactionsLabel.add(AccountDepositJRadioButton);
         TransactionsLabel.add(Amount);
         
         AccountTransactions = new ButtonGroup();
         AccountTransactions.add(AccountWithdrawalJRadioButton);
         AccountTransactions.add(AccountDepositJRadioButton);
    	 
         add(TransactionsLabel);
         
         Confirmation = new JButton("Confirm");
         add(Confirmation);
         Confirmation.addActionListener(new ActionListener() {
         	
 	public void actionPerformed(ActionEvent e) {
 				
 		if(Confirmation.isSelected())
 		{
 			if(AccountWithdrawalJRadioButton.isSelected())
 			{
 		 		String Withdrawal = Amount.getText();
 		 		     double amountDouble = Double.parseDouble(Withdrawal);
 		 				bankuser.UserBalance.setWithdrawal(amountDouble);
 			}	
 			if(AccountDepositJRadioButton.isSelected())
 			{
 						
 		 		String Deposit = Amount.getText();
 		 		      double amountDouble = Double.parseDouble(Deposit);
 		 		bankuser.UserBalance.setDeposit(amountDouble);

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
