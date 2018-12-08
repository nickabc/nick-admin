package jdbcday01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet resultSet = null;
		try {
		//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
		//2.获取数据库连接
			conn = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/jt_db", "root", "1234");
		//3.获取传输器
			st = conn.createStatement();
		//4.执行SQL
			resultSet = st.executeQuery("select * from user");
		//5.解析結果集
			while(resultSet.next()){
				String name = resultSet.getString(2);
				String userName = resultSet.getString("username");
				System.out.println(name);
				System.out.println(userName);
			}
		//6.释放资源
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
