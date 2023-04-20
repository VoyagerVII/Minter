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
	private final Bankaccount bankuser;
	
    private final JLabel greet;
    private final JLabel header;
    private final JLabel passwordLabel;
    private final JLabel userIDLabel;
    private final JLabel AccountCreationLabel;
    
    private final JTextField userID;
    private final JTextField Amount;
    
    private final JPasswordField password;
    
    private final JButton Login;
    private final JButton AccountCreationJButton;
    private final JButton AccountDeletionJButton;
    
    private final JPanel AccountCreation;
    private final JPanel TransactionsLabel;
    
    private final JRadioButton AccountWithdrawalJRadioButton;
    private final JRadioButton AccountDepositJRadioButton;
    
    private final ButtonGroup AccountTransactions;

    MinterfaceGUI() {
        super("Minter Banking APP"); // creates JFrame named Minter Banking APP
        setLayout(new FlowLayout()); // FlowLayout is set to be the layout of the JFrame
        getContentPane().setBackground(Color.WHITE);
        
        // LOGIN FRAME
        greet = new JLabel("Welcome user, Christian        ");
        passwordLabel = new JLabel("Username :");
        userIDLabel = new JLabel("Password: ");
        header = new JLabel("Minter Login:     ");
        userID = new JTextField(8);
        password = new JPasswordField(8);
        Amount = new JTextField(8);

        Login = new JButton("Login");
        AccountCreation = new JPanel();
        AccountCreationLabel = new JLabel("Account Interface: ");
        AccountCreationJButton = new JButton("Create");
        AccountDeletionJButton = new JButton("Delete");
        
        AccountCreation.add(AccountCreationLabel);
        AccountCreation.add(AccountCreationJButton);
        AccountCreation.add(AccountDeletionJButton);
        
        
        AccountWithdrawalJRadioButton = new JRadioButton("Withdrawal");
        AccountDepositJRadioButton = new JRadioButton("Deposit");
        
        TransactionsLabel = new JPanel();
        TransactionsLabel.add(AccountWithdrawalJRadioButton);
        TransactionsLabel.add(AccountDepositJRadioButton);
        TransactionsLabel.add(Amount);
        
        AccountTransactions = new ButtonGroup();
        AccountTransactions.add(AccountWithdrawalJRadioButton);
        AccountTransactions.add(AccountDepositJRadioButton);
        
        // ADD ALL PANELS INTO FRAME
        add(greet);
        add(header);
        add(passwordLabel);
        add(password);
        add(userIDLabel);
        add(userID);
        add(Login);
        add(AccountCreation);
        add(TransactionsLabel);

        Handler event = new Handler();
        userID.addActionListener(event);
        password.addActionListener(event);
        Login.addActionListener(event);
        bankuser = new Bankaccount();
    }

    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
        	
            if (event.getSource() == Login) {
            	if(bankuser.UserInfo.getUsername()==userID.getText())
            		JOptionPane.showMessageDialog(Login,"Account Created");
            	
            	
            }             				
            	
                // handle login button click
            }
        }
    }
