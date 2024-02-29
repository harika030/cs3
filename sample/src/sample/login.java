package sample;
// new change
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField TB1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("Button.light"));
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(145, 67, 289, 0);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(165, 11, 103, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME\r\n");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(94, 80, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD\r\n");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(94, 129, 89, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		TB1 = new JTextField();
		TB1.setBounds(213, 77, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=TB1.getText();
				String password=P1.getText();
				
				//JOptionPane.showMessageDialog(btnNewButton, "hello "+user+"\n your password is" +password);
				if(user.equals("Sri") && password.equals("12345678")) {
					JOptionPane.showMessageDialog(btnNewButton, "valid user");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "your username or password is incorrect");
				}
					
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(144, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		P1 = new JPasswordField();
		P1.setBounds(213, 129, 86, 20);
		frame.getContentPane().add(P1);
	}
}
