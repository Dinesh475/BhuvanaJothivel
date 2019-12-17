package WordCount;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCount {

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
					WordCount window = new WordCount();
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
	public WordCount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 721, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LETTER COUNTING");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(232, 48, 256, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the word:");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("RomanC", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(104, 135, 207, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(250, 235, 215));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("RomanC", Font.PLAIN, 20));
		textField.setBounds(384, 135, 207, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNoOfLetters = new JLabel("No of Letters:");
		lblNoOfLetters.setForeground(Color.PINK);
		lblNoOfLetters.setFont(new Font("RomanC", Font.PLAIN, 20));
		lblNoOfLetters.setBounds(104, 222, 207, 30);
		frame.getContentPane().add(lblNoOfLetters);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("RomanC", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(384, 222, 207, 25);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("COUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = textField.getText().length();
				textField_1.setText(len+"");
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("RomanC", Font.PLAIN, 20));
		btnNewButton.setBounds(298, 308, 130, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
