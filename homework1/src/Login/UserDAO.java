package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UserDAO {
	public void findUser(String userName,String userPassword) throws SQLException {
		String sql ="select* from message where username=";
		// ִ�����ݿ��ѯ���
		ResultSet rs;
        rs = DBUtil.stmt.executeQuery(sql+userName);
        if(rs!=null) {
        	if(rs.getString("userpassword").equals(userPassword)) {
        		JOptionPane.showMessageDialog(null, "��¼�ɹ�!");
        	}else {
        		JOptionPane.showMessageDialog(null, "�������!");
        	}
        }else {
        	JOptionPane.showMessageDialog(null, "�����ڸ��û�!");
        }
	}
}

class DBUtil{
	public static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=study";
	public static String user = "sa";
	public static String password = "123456";
	public static Connection con=null;
	public static Statement stmt=null;
	
	public DBUtil(){
		try{
			Class.forName(url);//������������
			//System.out.println("���ݿ�����������سɹ�");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			con=DriverManager.getConnection(url,user,password);//ȡ�����Ӷ���
			stmt=con.createStatement();//ȡ��SQL������
			System.out.print("�������ݿ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return con;
	}
	
	public Statement getMyStatement(){
		return stmt;
	}
	
	public void closeMyConnection(){//�ر����ݿ�����
		try{
			stmt.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
