package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class IO {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnF;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IO window = new IO();
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
	public IO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER APPLICATION FORM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(179, 8, 367, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("FIRST NAME  ");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblName.setBounds(140, 57, 137, 22);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBackground(new Color(250, 235, 215));
		textField.setForeground(new Color(139, 0, 0));
		textField.setFont(new Font("RomanC", Font.PLAIN, 19));
		textField.setBounds(345, 57, 254, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("LAST NAME  ");
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblLastName.setBounds(140, 103, 137, 22);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(139, 0, 0));
		textField_1.setFont(new Font("RomanC", Font.PLAIN, 19));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(345, 103, 254, 24);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH ");
		lblDateOfBirth.setForeground(Color.BLACK);
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDateOfBirth.setBounds(140, 146, 162, 22);
		frame.getContentPane().add(lblDateOfBirth);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(139, 0, 0));
		textField_2.setFont(new Font("RomanC", Font.PLAIN, 19));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(250, 235, 215));
		textField_2.setBounds(345, 146, 254, 24);
		frame.getContentPane().add(textField_2);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO  ");
		lblMobileNo.setForeground(Color.BLACK);
		lblMobileNo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblMobileNo.setBounds(140, 192, 137, 22);
		frame.getContentPane().add(lblMobileNo);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(139, 0, 0));
		textField_3.setFont(new Font("RomanC", Font.PLAIN, 19));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(250, 235, 215));
		textField_3.setBounds(345, 192, 254, 24);
		frame.getContentPane().add(textField_3);
		
		JLabel lblM = new JLabel("E-MAIL ID");
		lblM.setForeground(Color.BLACK);
		lblM.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblM.setBounds(140, 287, 137, 22);
		frame.getContentPane().add(lblM);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(139, 0, 0));
		textField_4.setFont(new Font("RomanC", Font.PLAIN, 19));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(250, 235, 215));
		textField_4.setBounds(345, 287, 254, 24);
		frame.getContentPane().add(textField_4);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblGender.setBounds(140, 240, 137, 22);
		frame.getContentPane().add(lblGender);
		
		rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnNewRadioButton.setBounds(345, 242, 67, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.setBackground(Color.LIGHT_GRAY);
		rdbtnF.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		rdbtnF.setBounds(479, 242, 67, 23);
		frame.getContentPane().add(rdbtnF);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1; 
                String data 
                    = "FIRST NAME : "
                      +textField.getText() + "\n"
                      +"LAST NAME : "
                      +textField_1.getText() + "\n"
                      +"DATE OF BIRTH : "
                      +textField_2.getText() + "\n"
                      +"MOBILE NO : "
                      +textField_3.getText() + "\n";
                if (rdbtnNewRadioButton.isSelected()) 
                    data1 = "GENDER : Male"
                            + "\n"; 
                else
                    data1 = "GENDER : Female"
                            + "\n"; 
                String data2 
                	= "E-MAIL ID : "
                	  + textField_4.getText();
                textArea.setText("REGISTRATION SUCCESSFUL!! YOUR DETAILS ARE\n\n"+data+data1+data2);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("RomanC", Font.BOLD, 22));
		btnNewButton.setBounds(295, 322, 143, 33);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(0, 100, 0));
		textArea.setFont(new Font("Courier New", Font.BOLD, 17));
		textArea.setBackground(new Color(250, 235, 215));
		textArea.setBounds(93, 366, 562, 178);
		frame.getContentPane().add(textArea);
		frame.setBounds(100, 100, 724, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
