package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class MeterConvertGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeterConvertGUI window = new MeterConvertGUI();
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
	public MeterConvertGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 719, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METER & KILOMETER CONVERSION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(138, 34, 457, 36);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("RomanC", Font.PLAIN, 20));
		textField.setForeground(new Color(0, 0, 128));
		textField.setBackground(new Color(250, 235, 215));
		textField.setBounds(284, 126, 163, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnMeter = new JButton("METER");
		btnMeter.setForeground(new Color(250, 235, 215));
		btnMeter.setFont(new Font("RomanC", Font.PLAIN, 20));
		btnMeter.setBackground(Color.DARK_GRAY);
		btnMeter.setBounds(177, 232, 178, 36);
		frame.getContentPane().add(btnMeter);
		btnMeter.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				long c = Long.parseLong(textField.getText())*1000;
				textField.setText(c+"");
			}
		});
		
		JButton btnKilometer = new JButton("KILOMETER");
		btnKilometer.setForeground(new Color(250, 235, 215));
		btnKilometer.setFont(new Font("RomanC", Font.PLAIN, 20));
		btnKilometer.setBackground(Color.DARK_GRAY);
		btnKilometer.setBounds(379, 232, 178, 36);
		frame.getContentPane().add(btnKilometer);
		btnKilometer.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				double c = Double.parseDouble(textField.getText())/1000;
				textField.setText(c+"");
			}
		});
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(250, 235, 215));
		btnClear.setFont(new Font("RomanC", Font.PLAIN, 20));
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.setBounds(273, 324, 178, 36);
		frame.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				textField.setText(null);
			}
		});
	}

}
