import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class First {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

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
		frame.setBackground(new Color(238, 232, 170));
		frame.setBounds(100, 100, 699, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name     :");
		lblName.setForeground(new Color(0, 100, 0));
		lblName.setFont(new Font("Courier New", Font.BOLD, 30));
		lblName.setBackground(new Color(0, 100, 0));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(121, 11, 180, 42);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setForeground(new Color(139, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField.setBackground(new Color(250, 235, 215));
		textField.setBounds(321, 17, 261, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.setBackground(new Color(255, 228, 181));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Courier New", Font.BOLD, 30));
		btnNewButton.setBounds(277, 382, 173, 35);
		panel.add(btnNewButton);
		
		JLabel lblE = new JLabel("E-Mail ID:");
		lblE.setFont(new Font("Courier New", Font.BOLD, 30));
		lblE.setForeground(new Color(0, 100, 0));
		lblE.setBounds(121, 117, 190, 35);
		panel.add(lblE);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(139, 0, 0));
		textField_1.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(316, 117, 266, 29);
		panel.add(textField_1);
		
		JLabel lblAddress = new JLabel("Address  :");
		lblAddress.setForeground(new Color(0, 100, 0));
		lblAddress.setFont(new Font("Courier New", Font.BOLD, 30));
		lblAddress.setBounds(121, 228, 190, 35);
		panel.add(lblAddress);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(139, 0, 0));
		textField_2.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(250, 235, 215));
		textField_2.setBounds(316, 228, 266, 29);
		panel.add(textField_2);
		
		JLabel lblQualification = new JLabel("Degree   :");
		lblQualification.setForeground(new Color(0, 100, 0));
		lblQualification.setFont(new Font("Courier New", Font.BOLD, 30));
		lblQualification.setBounds(121, 284, 190, 35);
		panel.add(lblQualification);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(139, 0, 0));
		textField_3.setFont(new Font("Courier New", Font.PLAIN, 30));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(250, 235, 215));
		textField_3.setBounds(316, 284, 266, 29);
		panel.add(textField_3);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMale.setFont(new Font("Courier New", Font.PLAIN, 30));
		rdbtnMale.setBackground(new Color(204, 255, 255));
		rdbtnMale.setForeground(new Color(0, 128, 0));
		rdbtnMale.setBounds(321, 71, 109, 29);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnFemale.setForeground(new Color(0, 128, 0));
		rdbtnFemale.setFont(new Font("Courier New", Font.PLAIN, 30));
		rdbtnFemale.setBackground(new Color(204, 255, 255));
		rdbtnFemale.setBounds(448, 71, 144, 29);
		panel.add(rdbtnFemale);
		
		JLabel lblGender = new JLabel("Gender   :");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setForeground(new Color(0, 100, 0));
		lblGender.setFont(new Font("Courier New", Font.BOLD, 30));
		lblGender.setBackground(new Color(0, 100, 0));
		lblGender.setBounds(121, 64, 180, 42);
		panel.add(lblGender);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('&');
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Courier New", Font.ITALIC, 20));
		passwordField.setBackground(new Color(255, 235, 205));
		passwordField.setBounds(316, 177, 266, 29);
		panel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(0, 100, 0));
		lblPassword.setFont(new Font("Courier New", Font.BOLD, 30));
		lblPassword.setBounds(121, 172, 190, 35);
		panel.add(lblPassword);
=======

public class First {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		frame.setBounds(100, 100, 455, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(107, 31, 46, 19);
		panel.add(lblName);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(107, 61, 46, 19);
		panel.add(lblEmail);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(107, 91, 66, 19);
		panel.add(lblAddress);
		
		textField = new JTextField();
		textField.setBounds(220, 30, 116, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 60, 116, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 90, 116, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Qualification");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(107, 121, 81, 19);
		panel.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 120, 116, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(192, 177, 89, 23);
		panel.add(btnSubmit);
>>>>>>> branch 'master' of https://github.com/BhuvanaJothivel/BhuvanaJothivel.git
	}
}
