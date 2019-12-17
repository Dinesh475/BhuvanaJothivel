package Swing;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TempGUI {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempGUI window = new TempGUI();
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
	public TempGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 701, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEMPERATURE CONVERSION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(121, 28, 446, 35);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(new Color(250, 235, 215));
		textField.setFont(new Font("RomanC", Font.PLAIN, 20));
		textField.setBounds(244, 146, 222, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Fahrenheit");
		btnNewButton.setFont(new Font("RomanC", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(250, 235, 215));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(197, 239, 147, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				double c = ((Double.parseDouble(textField.getText())-32)*5)/9;
				textField.setText(c+"");
			}
		});
		
		JButton btnCelsius = new JButton("Celsius");
		btnCelsius.setForeground(new Color(250, 235, 215));
		btnCelsius.setFont(new Font("RomanC", Font.PLAIN, 15));
		btnCelsius.setBackground(Color.DARK_GRAY);
		btnCelsius.setBounds(366, 239, 147, 23);
		frame.getContentPane().add(btnCelsius);
		btnCelsius.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				double c = ((Double.parseDouble(textField.getText())*9)/5)+32;
				textField.setText(c+"");
			}
		});
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(250, 235, 215));
		btnClear.setFont(new Font("RomanC", Font.PLAIN, 15));
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.setBounds(282, 304, 147, 23);
		frame.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				textField.setText(null);
			}
		});
	}
}
