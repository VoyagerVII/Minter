package Minter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.*;

public class MinterfaceGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Bankaccount bankuser;
	
    private final JLabel greet;
    private final JLabel header;
    private final JLabel passwordLabel;
    private final JLabel userIDLabel;
    private final JLabel AccountCreationLabel;
    
    private final JTextField userID;
    
    //private final JTextField AccoutCreationUserID;
    //private final JTextField AccoutCreationPassword;
    
    
    // private final JTextField Amount;
    
    private final JPasswordField password;
    
    private final JButton Login;
    private final JButton AccountCreationJButton;
    
    // private final JButton AccountDeletionJButton;
    
    private final JPanel AccountCreation;
    
    // TRANSACTIONS
    // private final JPanel TransactionsLabel;
    // private final JRadioButton AccountWithdrawalJRadioButton;
    // private final JRadioButton AccountDepositJRadioButton;
    // private final ButtonGroup AccountTransactions;

    public MinterfaceGUI() {
        super("Minter Banking APP"); // creates JFrame named Minter Banking APP
        setLayout(new FlowLayout()); // FlowLayout is set to be the layout of the JFrame
        getContentPane().setBackground(Color.WHITE);
        
        // LOGIN FRAME
        greet = new JLabel("Welcome to Minter!        ");
        passwordLabel = new JLabel("Password: ");
        userIDLabel = new JLabel("Username: ");
        header = new JLabel("Login:     ");
        userID = new JTextField(8);
        password = new JPasswordField(8);
        
        // Amount = new JTextField(8);

        Login = new JButton("Login");
        AccountCreation = new JPanel();
        AccountCreationLabel = new JLabel("Join now: ");
        
        // ACCOUNT CREATION TEXT BOXES
        //AccoutCreationUserID = new JTextField(7);
        // AccoutCreationPassword = new JTextField(7);
        
        
        AccountCreationJButton = new JButton("Create Account");
        
        AccountCreation.add(AccountCreationLabel);
        AccountCreation.add(AccountCreationJButton);
        
        
        // NEEDS EDIT HERE: ATTEMPTING TO PASS A FRAME FROM ANOTHER CLASS!!
        AccountCreationJButton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// PASS CREATION FRAME FROM MinterfaceUserFrame.java
				new MinterfaceUserFrame();
				
			}
        	
        });
        
        // (FOR USER SETTINGS FRAME)
        // AccountDeletionJButton = new JButton("Delete");
        // AccountCreation.add(AccountDeletionJButton);
        
        /*
        FOR USER DASHBOARD FRAME
         
        AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
        AccountDepositJRadioButton = new JRadioButton("Deposit"); 
        TransactionsLabel = new JPanel();
        TransactionsLabel.add(AccountWithdrawalJRadioButton);
        TransactionsLabel.add(AccountDepositJRadioButton);
        TransactionsLabel.add(Amount);
        
        AccountTransactions = new ButtonGroup();
        AccountTransactions.add(AccountWithdrawalJRadioButton);
        AccountTransactions.add(AccountDepositJRadioButton);
        */
        
        // ADD ALL PANELS INTO FRAME:
        
        // USER GREET & LOG-IN PROMPT
        add(greet);
        add(header);
        
        // USER ID FIELD
        add(userIDLabel);
        add(userID);
        
        // PASSWORD FIELD
        add(passwordLabel);
        add(password);
        
        // LOG-IN BUTTON
        add(Login);
        
        
        add(AccountCreation);
        
        
        // add(TransactionsLabel);
		

        Handler event = new Handler();
        userID.addActionListener(event);
        password.addActionListener(event);
        Login.addActionListener(event);
        bankuser = new Bankaccount();
    }
    

     private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
        	String username = userID.getText();
        	String Password = password.getText();

            bankuser.Account(username, "TEST", Password, "TEST");        	
            if (event.getSource() == Login) {
            	if(bankuser.UserInfo.login(username, Password))
            		JOptionPane.showMessageDialog(Login,"Account Created: "+bankuser.UserInfo.getUsername()+" "+bankuser.UserInfo.getPassword());
            else JOptionPane.showMessageDialog(Login,"Account Failed");

            }             				
            	
                // handle login button click
            }
        } // END OF HANDLER
    
    
    }
