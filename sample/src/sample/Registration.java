package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registration");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_1.setBounds(140, 11, 169, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(68, 51, 71, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(68, 97, 71, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(68, 129, 71, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(68, 160, 71, 24);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(68, 196, 57, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		tb1 = new JTextField();
		tb1.setBounds(223, 57, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(223, 94, 86, 20);
		frame.getContentPane().add(p1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "EEE", "ECE"}));
		c1.setToolTipText("CSE");
		c1.setBounds(223, 130, 86, 22);
		frame.getContentPane().add(c1);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setBounds(223, 163, 71, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setBounds(317, 163, 57, 23);
		frame.getContentPane().add(r2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "NZB", "MBB"}));
		c2.setBounds(223, 198, 86, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) c1.getSelectedItem();
				String city=(String) c2.getSelectedItem();
				
				String gender="";
				if(r1.isSelected())
				{
					gender="female";
				}
				if(r2.isSelected()) {
					gender="male";
				}
				JOptionPane.showMessageDialog(btnNewButton, "name :" +user+ "\n branch :" +branch+"\ncity :"+city+ "\n gender :" +gender);
			}
		});
		btnNewButton.setBounds(122, 231, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(91, 54, 5, 5);
		frame.getContentPane().add(tabbedPane);
	}
}
