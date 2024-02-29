package sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class books {

	private JFrame frame;
	int items=0;
	int bill=0;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books window = new books();
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
	public books() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219, 112, 147));
		frame.setBounds(100, 100, 671, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel L1 = new JLabel("cart : 0");
		L1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		L1.setBounds(528, 11, 96, 25);
		frame.getContentPane().add(L1);
		
		JLabel lblNewLabel_1 = new JLabel("E COMMERCE APP");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(190, 11, 252, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  items=items+1;
			  bill=bill+770;
			  L1.setText("cart :"+items);
			  
				
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lbbab\\Desktop\\book1.png"));
		b1.setBounds(43, 57, 160, 231);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+550;
				  L1.setText("cart :"+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\online lbbab\\Desktop\\img1.jfif"));
		b2.setBounds(222, 57, 193, 231);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+300;
				  L1.setText("cart :"+items);
			}
		});
		b3.setIcon(new ImageIcon("C:\\Users\\online lbbab\\Desktop\\book2.png"));
		b3.setBounds(442, 57, 182, 231);
		frame.getContentPane().add(b3);
		
		
		
		JButton btnNewButton_3 = new JButton("BUY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_3, "number of items  " +items+"\n total bill "+bill);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(523, 338, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Rs.770");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(84, 299, 70, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs.550");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(275, 305, 78, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.300");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(497, 305, 89, 22);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
