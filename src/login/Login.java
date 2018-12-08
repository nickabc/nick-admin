package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utils.JDBCUtil;

public class Login {

	public static void main(String[] args) {
		//接受键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		//接受用户名和密码
		String userName = sc.nextLine();
		System.out.println("请输入密码");
		
		String passWord = sc.nextLine(); 
		//验证用户是否存在
		login(userName,passWord);
	}

	private static void login(String userName, String passWord) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		//如果用用户名和密码查到记录，则登录成功，否则登录失败
		try {
			conn = JDBCUtil.getConnection();
//			st = conn.createStatement();
//			String sql = "select * from user where username ='"+userName+"'and password='" +passWord +"'";
//			rs = st.executeQuery(sql);
			String sql = "select * from user where username=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, passWord);
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("登录成功");
			}else{
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
