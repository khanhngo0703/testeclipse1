package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.EtchedBorder;

import Helpers.UserHelpers;

class FullScreenPanel extends JPanel {
	@Override
	public Dimension getPreferredSize() {
		return Toolkit.getDefaultToolkit().getScreenSize();
	}
}

public class MainJFrame {

	private JFrame frame;
	private JLabel avatar;
	private JLabel username;
	private JLabel lblEmployee;
	private JLabel lblSanPham;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame window = new MainJFrame();
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
	public MainJFrame() {
		initialize();
	}

	public MainJFrame(JFrame jframe) {
		initialize();
		loadImageNhanVien();
		loadImageSanPham();
		username.setText(UserHelpers.User.getUsername().toUpperCase());
		loadAvatarCurrentUser();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		// Create your full-screen panel
		FullScreenPanel fullScreenPanel = new FullScreenPanel();
		fullScreenPanel.setBackground(new Color(44, 62, 80));
		// Add your components to the fullScreenPanel

		// Set the content pane of the frame to your full-screen panel
		frame.setContentPane(fullScreenPanel);
		fullScreenPanel.setLayout(null);

		JLabel lblheader = new JLabel("");
		lblheader.setBounds(198, 0, 1000, 65);
		lblheader.setOpaque(true);
		lblheader.setForeground(new Color(255, 255, 255));
		lblheader.setBackground(new Color(255, 128, 0));
		fullScreenPanel.add(lblheader);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 76, 1280, 45);
		toolBar.setForeground(new Color(192, 192, 192));
		toolBar.setBackground(new Color(0, 0, 255));
		toolBar.setFloatable(false);
		toolBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		fullScreenPanel.add(toolBar);

		JButton changePassword = new JButton("Đổi Mật Khẩu");
		changePassword.setBackground(new Color(0, 255, 255));
		changePassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		changePassword.setForeground(new Color(255, 255, 255));
		toolBar.add(changePassword);
		toolBar.addSeparator();

		JButton btnNewButton_1 = new JButton("Đăng Xuất");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		toolBar.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 199, 65);
		fullScreenPanel.add(panel);
		panel.setLayout(null);

		avatar = new JLabel("New label");
		avatar.setForeground(new Color(255, 255, 255));
		avatar.setFont(new Font("Tahoma", Font.BOLD, 14));
		avatar.setBackground(new Color(128, 128, 128));
		avatar.setBounds(10, 11, 69, 43);
		panel.add(avatar);

		fullScreenPanel.setComponentZOrder(panel, fullScreenPanel.getComponentCount() - 2); // Just above lblheader
		fullScreenPanel.setComponentZOrder(avatar, fullScreenPanel.getComponentCount() - 1); // On top

		username = new JLabel("New label");
		username.setForeground(new Color(255, 255, 255));
		username.setFont(new Font("Tahoma", Font.BOLD, 14));
		username.setBackground(new Color(128, 128, 128));
		username.setBounds(109, 11, 80, 43);
		panel.add(username);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 0));
		panel_1.setBounds(1197, 0, 83, 65);
		fullScreenPanel.add(panel_1);
		panel_1.setLayout(null);

		JLabel jLabelMin = new JLabel("-");
		jLabelMin.setForeground(new Color(255, 255, 255));
		jLabelMin.setFont(new Font("Tahoma", Font.BOLD, 24));
		jLabelMin.setBounds(0, 0, 39, 65);
		panel_1.add(jLabelMin);

		JLabel jLabelClose = new JLabel("X");
		jLabelClose.setForeground(new Color(255, 255, 255));
		jLabelClose.setFont(new Font("Tahoma", Font.BOLD, 24));
		jLabelClose.setBounds(44, 0, 39, 65);
		panel_1.add(jLabelClose);

		JPanel jpannhanvien = new JPanel();
		jpannhanvien.setBorder(null);
		jpannhanvien.setBackground(new Color(44, 62, 80));
		jpannhanvien.setBounds(85, 165, 280, 195);
		fullScreenPanel.add(jpannhanvien);
		jpannhanvien.setLayout(null);

		JLabel lblNewLabel = new JLabel("NHÂN VIÊN");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(69, 143, 145, 41);
		jpannhanvien.add(lblNewLabel);

		lblEmployee = new JLabel("");
		lblEmployee.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblEmployee.setBounds(10, 11, 260, 121);
		jpannhanvien.add(lblEmployee);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(44, 62, 80));
		panel_2.setBounds(85, 417, 280, 195);
		fullScreenPanel.add(panel_2);
		panel_2.setLayout(null);

		JLabel areaTable = new JLabel("");
		areaTable.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		areaTable.setBounds(10, 11, 260, 121);
		panel_2.add(areaTable);

		JLabel lblNewLabel_1 = new JLabel("KHÔNG GIAN QUÁN");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(20, 143, 242, 41);
		panel_2.add(lblNewLabel_1);
		jpannhanvien.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(44, 62, 80));
		panel_3.setBounds(534, 165, 280, 195);
		fullScreenPanel.add(panel_3);
		panel_3.setLayout(null);

		lblSanPham = new JLabel("");
		lblSanPham.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblSanPham.setBounds(10, 11, 260, 121);
		panel_3.add(lblSanPham);

		JLabel lblNewLabel_2 = new JLabel("SẢN PHẨM");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(80, 143, 131, 41);
		panel_3.add(lblNewLabel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(44, 62, 80));
		panel_4.setBounds(534, 417, 280, 195);
		fullScreenPanel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblThongKe = new JLabel("");
		lblThongKe.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblThongKe.setBounds(10, 11, 260, 121);
		panel_4.add(lblThongKe);

		JLabel lblNewLabel_3 = new JLabel("THỐNG KÊ");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(76, 143, 139, 41);
		panel_4.add(lblNewLabel_3);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(new Color(44, 62, 80));
		panel_5.setBounds(956, 165, 280, 195);
		fullScreenPanel.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblThucDon = new JLabel("");
		lblThucDon.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblThucDon.setBounds(10, 11, 260, 121);
		panel_5.add(lblThucDon);

		JLabel lblNewLabel_4 = new JLabel("POS BÁN HÀNG");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setBounds(49, 143, 189, 41);
		panel_5.add(lblNewLabel_4);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBackground(new Color(44, 62, 80));
		panel_6.setBounds(956, 417, 280, 195);
		fullScreenPanel.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblThongTin = new JLabel("");
		lblThongTin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblThongTin.setBounds(10, 11, 260, 121);
		panel_6.add(lblThongTin);

		JLabel lblNewLabel_5 = new JLabel("KHÁCH HÀNG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(62, 143, 166, 41);
		panel_6.add(lblNewLabel_5);

		frame.pack();
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		frame.setVisible(b);

	}

	public void loadAvatarCurrentUser() {
		avatar.setSize(45, 45);
		avatar.setText("");

		if (UserHelpers.User.getImageUser() != null) {
			try {
				BufferedImage img = ImageIO.read(new File("logos", UserHelpers.User.getImageUser()));
				Image imageScale = img.getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(imageScale);
				avatar.setIcon(imageIcon);
			} catch (Exception e) {
				avatar.setIcon(null);
				e.printStackTrace();
			}
		} else {
			try {
				BufferedImage img = ImageIO.read(new File("logos", "employs.jpg"));
				Image imageScale = img.getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(imageScale);
				avatar.setIcon(imageIcon);
			} catch (Exception e) {
				avatar.setIcon(null);
				e.printStackTrace();
			}
		}
	}

	public void loadImageNhanVien() {
		try {
			String imagePath = UserHelpers.User.getImageUser();
			if(imagePath == null) {
				imagePath = "employs.jpg";
			}
			BufferedImage img = ImageIO.read(new File("logos", imagePath));
			Image imageScale = img.getScaledInstance(lblEmployee.getWidth(), lblEmployee.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(imageScale);
			lblEmployee.setIcon(imageIcon);
		} catch (Exception e) {
			lblEmployee.setIcon(null);
			e.printStackTrace();
		}
	}
	
	public void loadImageSanPham() {
        try {
            BufferedImage img = ImageIO.read(new File("logos", "125-fall-in-love.jpg"));
            Image imageScale = img.getScaledInstance(lblSanPham.getWidth(), lblSanPham.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(imageScale);
            lblSanPham.setIcon(imageIcon);
        } catch (Exception e) {
            lblSanPham.setIcon(null);
            e.printStackTrace();
        }
    }
}
