package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class help extends javax.swing.JFrame {

	private JFrame frame;
	private JLabel lblloi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					help window = new help();
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
	public help() {
		initialize();
	}
	
	

	public help(String message, JFrame frame) {
		this.frame = frame;
		this.setLocationRelativeTo(frame);
		initialize();
		this.lblloi.setText(message);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 586, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HỘP THÔNG BÁO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(199, 11, 161, 22);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 64));
		panel_1.setBounds(0, 44, 586, 229);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblloi = new JLabel("");
		lblloi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblloi.setForeground(new Color(255, 255, 255));
		lblloi.setBounds(0, 68, 586, 62);
		lblloi.setHorizontalAlignment(SwingConstants.CENTER);
		lblloi.setVerticalAlignment(SwingConstants.CENTER);
		panel_1.add(lblloi);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(237, 178, 89, 40);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 64));
		panel_2.setBounds(0, 271, 586, 68);
		frame.getContentPane().add(panel_2);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);
		
	}
}
