package Login;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JPasswordField;

public class Login extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserDAO dao;
	private JTextField tfUserName;
	JLabel labelLoginInfo = new JLabel("");
	private JPasswordField pwdField;
	public Login() {
		setResizable(false);
		setSize(new Dimension(350, 250));
		setLocation(500, 200);// 在屏幕中设置显示的位置
		setTitle("\u767B\u9646\u754C\u9762");
		getContentPane().setLayout(null);

		JLabel labelUserName = new JLabel("\u7528\u6237\u8D26\u53F7\uFF1A");
		labelUserName.setBounds(40, 48, 92, 21);
		getContentPane().add(labelUserName);

		JLabel labelPassword = new JLabel("\u7528\u6237\u5BC6\u7801\uFF1A");
		labelPassword.setBounds(40, 84, 92, 21);
		getContentPane().add(labelPassword);

		tfUserName = new JTextField();
		tfUserName.setBounds(135, 47, 110, 27);
		getContentPane().add(tfUserName);
		tfUserName.setColumns(10);

		JButton btnLogin = new JButton("\u767B\u9646");
		btnLogin.setBounds(50, 129, 83, 29);
		btnLogin.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mouseClicked(MouseEvent e) {
				try {
					dao.findUser(tfUserName.getText(),pwdField.getText() );
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		getContentPane().add(btnLogin);

		JButton btnClose = new JButton("\u9000\u51FA");
		btnClose.setBounds(162, 129, 83, 29);
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); // 关闭当前窗体
			}
		});
		getContentPane().add(btnClose);
		labelLoginInfo.setBounds(100, 174, 120, 21);
		labelLoginInfo.setForeground(Color.RED);
		getContentPane().add(labelLoginInfo);

		pwdField = new JPasswordField();
		pwdField.setBounds(135, 81, 110, 27);
		getContentPane().add(pwdField);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.start();
	}
	
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
