package Minter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinterfaceUserFrame extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField fullNameField;
    private JButton createButton;

   MinterfaceUserFrame() {
        super("Create Account");

        // create the components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel fullNameLabel = new JLabel("Full Name:");
        usernameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JTextField(20);
        fullNameField = new JTextField(20);
        createButton = new JButton("Create");

        // add the components to the frame
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(fullNameLabel);
        panel.add(fullNameField);
        panel.add(createButton);

        add(panel);

        // register the button for events
        createButton.addActionListener(this);

        // set the frame properties
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // create the account with the provided information
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String fullName = fullNameField.getText();

        Bankaccount bankAccount = new Bankaccount();
        bankAccount.Account(username, email, password, fullName);

        // show a message to the user that the account was created successfully
        JOptionPane.showMessageDialog(this, "Account created successfully");

        // close the frame
        dispose();
    }
}
