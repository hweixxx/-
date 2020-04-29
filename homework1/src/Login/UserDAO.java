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
		// 执行数据库查询语句
		ResultSet rs;
        rs = DBUtil.stmt.executeQuery(sql+userName);
        if(rs!=null) {
        	if(rs.getString("userpassword").equals(userPassword)) {
        		JOptionPane.showMessageDialog(null, "登录成功!");
        	}else {
        		JOptionPane.showMessageDialog(null, "密码错误!");
        	}
        }else {
        	JOptionPane.showMessageDialog(null, "不存在该用户!");
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
			Class.forName(url);//加载驱动程序
			//System.out.println("数据库驱动程序加载成功");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			con=DriverManager.getConnection(url,user,password);//取得连接对象
			stmt=con.createStatement();//取得SQL语句对象
			System.out.print("连接数据库成功");
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
	
	public void closeMyConnection(){//关闭数据库连接
		try{
			stmt.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
