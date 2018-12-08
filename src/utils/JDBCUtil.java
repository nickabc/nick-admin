package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	//私有化构造函数，不让外界创建实例
	private JDBCUtil(){};
	
	//创建静态方法获取连接
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException{
		Connection conn = null;
		try {
			Properties prop = new Properties();
			String filename = "jdbc.properties";
			prop.load(new FileInputStream(new File(filename)));
			
			Class.forName(prop.getProperty("driverClass"));
			conn = DriverManager.
					getConnection(prop.getProperty("jdbcUrl"), 
							prop.getProperty("username"), 
							prop.getProperty("password"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//创建静态方法释放资源
	public static void close(Connection conn,Statement st,ResultSet rs){
		//關閉傳輸器
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				conn = null;
			}
		}
	}

}
