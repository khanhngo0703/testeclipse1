package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;

import DAO.UserImplements;
import Helpers.UserHelpers;

import javax.swing.JCheckBox;
import javax.swing.JButton;

import data.UserAccount;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	UserImplements ui = new UserImplements();
	help al;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1167, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 64));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 0, 1157, 21);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Coffe Management");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);

		JLabel lblTren = new JLabel("");
		lblTren.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblTren.setBounds(10, 25, 1157, 178);
		lblTren.setIcon(new ImageIcon(Login.class.getResource("/images/dau.png")));
		lblTren.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		frame.getContentPane().add(lblTren);

		JLabel lblTrai = new JLabel("");
		lblTrai.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblTrai.setBounds(10, 208, 294, 232);
		lblTrai.setIcon(new ImageIcon(Login.class.getResource("/images/trai1.png")));
		lblTrai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		frame.getContentPane().add(lblTrai);

		JLabel lblPhai = new JLabel("");
		lblPhai.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPhai.setBounds(873, 208, 294, 232);
		lblPhai.setIcon(new ImageIcon(Login.class.getResource("/images/phai.png")));
		lblPhai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		frame.getContentPane().add(lblPhai);

		JLabel lblDuoi = new JLabel("");
		lblDuoi.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblDuoi.setBounds(10, 445, 1157, 178);
		lblDuoi.setIcon(new ImageIcon(Login.class.getResource("/images/duoi.png")));
		lblDuoi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		frame.getContentPane().add(lblDuoi);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(309, 208, 554, 232);
		panel_1.setBackground(new Color(44, 62, 80));
		panel_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(53, 34, 144, 30);
		panel_1.add(lblNewLabel_1);

		username = new JTextField();
		username.setBackground(new Color(192, 192, 192));
		username.setBounds(237, 34, 253, 27);
		panel_1.add(username);
		username.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Mật khẩu:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(53, 75, 144, 30);
		panel_1.add(lblNewLabel_2);

		JCheckBox showPassword = new JCheckBox("Hiển thị mật khẩu");
		showPassword.setForeground(new Color(255, 255, 255));
		showPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		showPassword.setBackground(new Color(44, 62, 80));
		showPassword.setBounds(191, 127, 157, 23);
		panel_1.add(showPassword);

		JButton login = new JButton("Đăng nhập");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		login.setFont(new Font("Tahoma", Font.BOLD, 14));
		login.setContentAreaFilled(false);
		login.setBackground(new Color(0, 128, 255));
		login.setOpaque(true);
		login.setForeground(new Color(255, 255, 255));
		login.setBounds(139, 157, 137, 41);
		panel_1.add(login);

		JButton exit = new JButton("Thoát");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBackground(new Color(255, 0, 0));
		exit.setForeground(new Color(255, 255, 255));
		exit.setFont(new Font("Tahoma", Font.BOLD, 14));
		exit.setBounds(297, 157, 137, 41);
		exit.setContentAreaFilled(false);
		exit.setOpaque(true);
		panel_1.add(exit);

		password = new JPasswordField();
		password.setBackground(new Color(192, 192, 192));
		password.setBounds(237, 78, 253, 27);
		panel_1.add(password);
	}

	public void login() {
		String username = this.username.getText();
		String password = new String(this.password.getPassword());
		int i = 0;
		if (username.length() == 0) {
			alert("Hãy nhập tên người dùng", this);
		} else {
			i += 1;
		}

		if (i == 1 && password.length() == 0) {
			alert("Hãy nhập mật khẩu", this);
		} else {
			i += 1;
		}

		if (i == 2) {
			UserAccount ua = ui.findUserByUsername(username);
			try {
				if (ua != null) {
					String userPassword = ua.getPassword();
					if (userPassword.equals(password)) {
						UserHelpers.User = ua;
						MainJFrame mj = new MainJFrame();
						mj.setVisible(true);
						dispose();
					} else {
						 alert("Mật khẩu không đúng", this);
					}
				} else {
					alert("Tài khoản không tồn tại", this);
				}
			} catch (Exception e) {
				alert("Lỗi truy vấn dữ liệu", this);
				e.printStackTrace();
			}
		}
	}
	
	public void alert(String message, JFrame Login) {
		al = new help(message, Login);
		al.setLocationRelativeTo(Login);
		al.setVisible(true);
	}
}
