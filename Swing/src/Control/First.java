package Control;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.*;
public class First {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First window = new First();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 664, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("BOOK YOUR TRAIN TICKET");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(134, 11, 381, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FROM");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(103, 80, 79, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 0));
		textField.setBackground(new Color(255, 255, 224));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(328, 80, 225, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setForeground(new Color(0, 0, 128));
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblTo.setBounds(103, 125, 79, 22);
		frame.getContentPane().add(lblTo);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 224));
		textField_1.setBounds(328, 125, 225, 23);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setForeground(new Color(0, 0, 128));
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblDate.setBounds(103, 171, 79, 22);
		frame.getContentPane().add(lblDate);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setForeground(new Color(0, 0, 128));
		lblClass.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblClass.setBounds(103, 215, 79, 22);
		frame.getContentPane().add(lblClass);
		
		JLabel lblNoOfPassenger = new JLabel("NO OF PASSENGER");
		lblNoOfPassenger.setForeground(new Color(0, 0, 128));
		lblNoOfPassenger.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNoOfPassenger.setBounds(103, 261, 182, 22);
		frame.getContentPane().add(lblNoOfPassenger);
	}

}
