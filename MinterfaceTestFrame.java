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

public class MinterfaceTestFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private final JLabel label1;

	public MinterfaceTestFrame() {
		super("Test Frame");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("This is the second frame of the project.");
		
		add(label1);
		
	}
}