package Condition;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Condition  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JCheckBox checkBox;
	private JCheckBox checkBox_25;
	private JLabel label_5;
	private JLabel label_4;
	private JTextArea textArea;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_5;
	private JCheckBox checkBox_6;
	private JCheckBox checkBox_7;
	private JCheckBox checkBox_8;
	private JCheckBox checkBox_9;
	private JCheckBox checkBox_10;
	private JCheckBox checkBox_11;
	private JCheckBox checkBox_12;
	private JCheckBox checkBox_13;
	private JCheckBox checkBox_14;
	private JCheckBox checkBox_15;
	private JCheckBox checkBox_16;
	private JCheckBox checkBox_17;
	private JCheckBox checkBox_18;
	private JCheckBox checkBox_19;
	private JCheckBox checkBox_20;
	private JCheckBox checkBox_21;
	private JCheckBox checkBox_22;
	private JCheckBox checkBox_23;
	private JCheckBox checkBox_24;
	private JButton btnSubmit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Condition window = new Condition();
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
	public Condition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 1133, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKING TICKETS");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(330, 11, 296, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(330, 140, 296, 138);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblName.setBounds(10, 11, 46, 18);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setForeground(new Color(0, 100, 0));
		textField.setBackground(new Color(250, 235, 215));
		textField.setBounds(82, 9, 204, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDob.setBounds(10, 42, 46, 18);
		panel.add(lblDob);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_1.setForeground(new Color(0, 100, 0));
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setColumns(10);
		textField_1.setBounds(82, 40, 148, 20);
		panel.add(textField_1);
		
		JCheckBox chckbxPhysicallyChallenged = new JCheckBox("PHYSICALLY CHALLENGED");
		chckbxPhysicallyChallenged.setBackground(Color.LIGHT_GRAY);
		chckbxPhysicallyChallenged.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxPhysicallyChallenged.setBounds(10, 78, 276, 23);
		panel.add(chckbxPhysicallyChallenged);
		
		JLabel lblSeatNo = new JLabel("SEAT NO:");
		lblSeatNo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSeatNo.setBounds(10, 108, 73, 18);
		panel.add(lblSeatNo);
		
		label_4 = new JLabel("");
		label_4.setBackground(SystemColor.inactiveCaptionBorder);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_4.setBounds(87, 108, 73, 18);
		panel.add(label_4);
		
		JLabel label = new JLabel("BOOKING DETAILS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial Black", Font.BOLD, 15));
		label.setBackground(Color.GRAY);
		label.setBounds(330, 85, 296, 23);
		frame.getContentPane().add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(330, 289, 296, 138);
		frame.getContentPane().add(panel_1);
		
		JLabel label_1 = new JLabel("NAME");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_1.setBounds(10, 11, 46, 18);
		panel_1.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_2.setForeground(new Color(0, 100, 0));
		textField_2.setBackground(new Color(250, 235, 215));
		textField_2.setColumns(10);
		textField_2.setBounds(82, 9, 204, 20);
		panel_1.add(textField_2);
		
		JLabel label_2 = new JLabel("DOB");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_2.setBounds(10, 42, 46, 18);
		panel_1.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField_3.setForeground(new Color(0, 100, 0));
		textField_3.setBackground(new Color(250, 235, 215));
		textField_3.setColumns(10);
		textField_3.setBounds(82, 40, 150, 20);
		panel_1.add(textField_3);
		
		checkBox_25 = new JCheckBox("PHYSICALLY CHALLENGED");
		checkBox_25.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		checkBox_25.setBackground(Color.LIGHT_GRAY);
		checkBox_25.setBounds(10, 78, 276, 23);
		panel_1.add(checkBox_25);
		
		JLabel label_3 = new JLabel("SEAT NO:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_3.setBounds(10, 108, 73, 18);
		panel_1.add(label_3);
		
		label_5 = new JLabel("");
		label_5.setBackground(SystemColor.inactiveCaptionBorder);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_5.setBounds(82, 108, 73, 18);
		panel_1.add(label_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(699, 140, 352, 287);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea.setForeground(new Color(0, 100, 0));
		textArea.setBackground(new Color(250, 235, 215));
		textArea.setBounds(29, 32, 291, 195);
		panel_2.add(textArea);
		
		JButton btnNewButton = new JButton("PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cost = 750;
				int dis = 20;
				int total = cost*2;
				double dist = ((double)total*(double)dis)/100;
				int gst = 10;
				double GST = ((double)total*(double)gst)/100;
				String data = "COST\t"+cost+"\tRs\n"
						+"NOS\t"+"2"+"\n"
						+"TOTAL\t"+total+"\tRs\n"
						+"DISCOUNT\t"+"-"+dist+"\tRs\n"
						+"GST\t"+"+"+GST+"\tRs\n";
				double net_price = total-dist+GST;
				String data1 = "\nNET PRICE\t"+net_price+"\tRs";
				textArea.setText(data+data1);
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(141, 253, 89, 23);
		panel_2.add(btnNewButton);
		
		JLabel lblBusFareDetails = new JLabel("BUS FARE DETAILS");
		lblBusFareDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusFareDetails.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblBusFareDetails.setBackground(Color.GRAY);
		lblBusFareDetails.setBounds(653, 85, 296, 23);
		frame.getContentPane().add(lblBusFareDetails);
		
		JLabel lblSeats = new JLabel("SEATS");
		lblSeats.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeats.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblSeats.setBackground(Color.GRAY);
		lblSeats.setBounds(112, 85, 113, 23);
		frame.getContentPane().add(lblSeats);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(75, 140, 184, 287);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		
		checkBox = new JCheckBox("");
		checkBox.setForeground(Color.DARK_GRAY);
		checkBox.setBackground(Color.LIGHT_GRAY);
		checkBox.setBounds(34, 60, 21, 23);
		panel_3.add(checkBox);
		checkBox.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"1":""));    
            }    
         });    
		
		checkBox_1 = new JCheckBox("");
		checkBox_1.setForeground(Color.DARK_GRAY);
		checkBox_1.setBackground(Color.LIGHT_GRAY);
		checkBox_1.setBounds(57, 60, 21, 23);
		panel_3.add(checkBox_1);
		checkBox_1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"2":""));    
            }    
         }); 
		
		checkBox_2 = new JCheckBox("");
		checkBox_2.setForeground(Color.DARK_GRAY);
		checkBox_2.setBackground(Color.LIGHT_GRAY);
		checkBox_2.setBounds(102, 60, 21, 23);
		panel_3.add(checkBox_2);
		checkBox_2.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"3":""));    
            }    
         });
		
		checkBox_3 = new JCheckBox("");
		checkBox_3.setForeground(Color.DARK_GRAY);
		checkBox_3.setBackground(Color.LIGHT_GRAY);
		checkBox_3.setBounds(125, 60, 21, 23);
		panel_3.add(checkBox_3);
		checkBox_3.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"4":""));    
            }    
         }); 
		
		checkBox_4 = new JCheckBox("");
		checkBox_4.setForeground(Color.DARK_GRAY);
		checkBox_4.setBackground(Color.LIGHT_GRAY);
		checkBox_4.setBounds(34, 83, 21, 23);
		panel_3.add(checkBox_4);
		checkBox_4.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"5":""));    
            }    
         });
		
		checkBox_5 = new JCheckBox("");
		checkBox_5.setForeground(Color.DARK_GRAY);
		checkBox_5.setBackground(Color.LIGHT_GRAY);
		checkBox_5.setBounds(57, 83, 21, 23);
		panel_3.add(checkBox_5);
		checkBox_5.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"6":""));    
            }    
         }); 
		
		checkBox_6 = new JCheckBox("");
		checkBox_6.setForeground(Color.DARK_GRAY);
		checkBox_6.setBackground(Color.LIGHT_GRAY);
		checkBox_6.setBounds(102, 83, 21, 23);
		panel_3.add(checkBox_6);
		checkBox_6.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"7":""));    
            }    
         });
		
		checkBox_7 = new JCheckBox("");
		checkBox_7.setForeground(Color.DARK_GRAY);
		checkBox_7.setBackground(Color.LIGHT_GRAY);
		checkBox_7.setBounds(125, 83, 21, 23);
		panel_3.add(checkBox_7);
		checkBox_7.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"8":""));    
            }    
         }); 
		
		checkBox_8 = new JCheckBox("");
		checkBox_8.setForeground(Color.DARK_GRAY);
		checkBox_8.setBackground(Color.LIGHT_GRAY);
		checkBox_8.setBounds(34, 105, 21, 23);
		panel_3.add(checkBox_8);
		checkBox_8.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"9":""));    
            }    
         });
		
		checkBox_9 = new JCheckBox("");
		checkBox_9.setForeground(Color.DARK_GRAY);
		checkBox_9.setBackground(Color.LIGHT_GRAY);
		checkBox_9.setBounds(57, 105, 21, 23);
		panel_3.add(checkBox_9);
		checkBox_9.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"10":""));    
            }    
         }); 
		
		checkBox_10 = new JCheckBox("");
		checkBox_10.setForeground(Color.DARK_GRAY);
		checkBox_10.setBackground(Color.LIGHT_GRAY);
		checkBox_10.setBounds(102, 105, 21, 23);
		panel_3.add(checkBox_10);
		checkBox_10.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"11":""));    
            }    
         });
		
		checkBox_11 = new JCheckBox("");
		checkBox_11.setForeground(Color.DARK_GRAY);
		checkBox_11.setBackground(Color.LIGHT_GRAY);
		checkBox_11.setBounds(125, 105, 21, 23);
		panel_3.add(checkBox_11);
		checkBox_11.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"12":""));    
            }    
         }); 
		
		checkBox_12 = new JCheckBox("");
		checkBox_12.setForeground(Color.DARK_GRAY);
		checkBox_12.setBackground(Color.LIGHT_GRAY);
		checkBox_12.setBounds(34, 128, 21, 23);
		panel_3.add(checkBox_12);
		checkBox_12.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"13":""));    
            }    
         });
		
		checkBox_13 = new JCheckBox("");
		checkBox_13.setForeground(Color.DARK_GRAY);
		checkBox_13.setBackground(Color.LIGHT_GRAY);
		checkBox_13.setBounds(57, 128, 21, 23);
		panel_3.add(checkBox_13);
		checkBox_13.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"14":""));    
            }    
         }); 
		
		checkBox_14 = new JCheckBox("");
		checkBox_14.setForeground(Color.DARK_GRAY);
		checkBox_14.setBackground(Color.LIGHT_GRAY);
		checkBox_14.setBounds(102, 128, 21, 23);
		panel_3.add(checkBox_14);
		checkBox_14.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"15":""));    
            }    
         });
		
		checkBox_15 = new JCheckBox("");
		checkBox_15.setForeground(Color.DARK_GRAY);
		checkBox_15.setBackground(Color.LIGHT_GRAY);
		checkBox_15.setBounds(125, 128, 21, 23);
		panel_3.add(checkBox_15);
		checkBox_15.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"16":""));    
            }    
         }); 
		
		checkBox_16 = new JCheckBox("");
		checkBox_16.setForeground(Color.DARK_GRAY);
		checkBox_16.setBackground(Color.LIGHT_GRAY);
		checkBox_16.setBounds(34, 151, 21, 23);
		panel_3.add(checkBox_16);
		checkBox_16.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"17":""));    
            }    
         });
		
		checkBox_17 = new JCheckBox("");
		checkBox_17.setForeground(Color.DARK_GRAY);
		checkBox_17.setBackground(Color.LIGHT_GRAY);
		checkBox_17.setBounds(57, 151, 21, 23);
		panel_3.add(checkBox_17);
		checkBox_17.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"18":""));    
            }    
         }); 
		
		checkBox_18 = new JCheckBox("");
		checkBox_18.setForeground(Color.DARK_GRAY);
		checkBox_18.setBackground(Color.LIGHT_GRAY);
		checkBox_18.setBounds(102, 151, 21, 23);
		panel_3.add(checkBox_18);
		checkBox_18.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"19":""));    
            }    
         });
		
		checkBox_19 = new JCheckBox("");
		checkBox_19.setForeground(Color.DARK_GRAY);
		checkBox_19.setBackground(Color.LIGHT_GRAY);
		checkBox_19.setBounds(125, 151, 21, 23);
		panel_3.add(checkBox_19);
		checkBox_19.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"20":""));    
            }    
         }); 
		
		checkBox_20 = new JCheckBox("");
		checkBox_20.setForeground(Color.DARK_GRAY);
		checkBox_20.setBackground(Color.LIGHT_GRAY);
		checkBox_20.setBounds(34, 177, 21, 23);
		panel_3.add(checkBox_20);
		checkBox_20.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"21":""));    
            }    
         });
		
		checkBox_21 = new JCheckBox("");
		checkBox_21.setForeground(Color.DARK_GRAY);
		checkBox_21.setBackground(Color.LIGHT_GRAY);
		checkBox_21.setBounds(57, 177, 21, 23);
		panel_3.add(checkBox_21);
		checkBox_21.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"22":""));    
            }    
         }); 
		
		checkBox_22 = new JCheckBox("");
		checkBox_22.setForeground(Color.DARK_GRAY);
		checkBox_22.setBackground(Color.LIGHT_GRAY);
		checkBox_22.setBounds(80, 177, 21, 23);
		panel_3.add(checkBox_22);
		checkBox_22.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_4.setText((e.getStateChange()==1?"23":""));    
            }    
         });
		
		checkBox_23 = new JCheckBox("");
		checkBox_23.setForeground(Color.DARK_GRAY);
		checkBox_23.setBackground(Color.LIGHT_GRAY);
		checkBox_23.setBounds(102, 177, 21, 23);
		panel_3.add(checkBox_23);
		checkBox_23.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label_5.setText((e.getStateChange()==1?"24":""));    
            }    
         }); 
		
		checkBox_24 = new JCheckBox("");
		checkBox_24.setForeground(Color.DARK_GRAY);
		checkBox_24.setBackground(Color.LIGHT_GRAY);
		checkBox_24.setBounds(125, 177, 21, 23);
		panel_3.add(checkBox_24);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"SUCCESFULLY REGISTERED");
			}
		});
		btnSubmit.setBackground(Color.GRAY);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSubmit.setBounds(426, 457, 113, 23);
		frame.getContentPane().add(btnSubmit);
		checkBox_24.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) { 
				label_4.setText(e.getStateChange()==1?"25":"");
			}
		});
		
	}
}
