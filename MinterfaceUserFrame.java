package Minter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
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

public class MinterfaceUserFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JTextField AccoutCreationUserID;
    private final JTextField AccoutCreationPassword;
    
    
    public MinterfaceUserFrame(){
    	super("Account Creation");
    	setLayout(new FlowLayout()); // FlowLayout is set to be the layout of the JFrame
        getContentPane().setBackground(Color.WHITE);
        
        AccoutCreationUserID = new JTextField(7);
        AccoutCreationPassword = new JTextField(7);
        
        Panel userInputs = new Panel();
        userInputs.add(AccoutCreationUserID);
		userInputs.add(AccoutCreationPassword);
		
		add(userInputs);
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
