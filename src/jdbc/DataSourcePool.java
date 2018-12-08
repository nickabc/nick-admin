package jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import utils.JDBCUtil;

public class DataSourcePool implements DataSource {
	
	//先存一些连接
	private static List<Connection> connList = new ArrayList<>();
	static{
		for(int i =0;i<5;i++){
			try {
				Connection conn = JDBCUtil.getConnection();
				connList.add(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//从连接池中获取连接
	public static Connection getConection(){
		System.out.println("之前有"+connList.size()+"个连接");
		Connection conn = connList.remove(0);
		System.out.println("被拿走一个连接，现在有"+connList.size()+"个连接");
		return conn;
	}
	//归还连接到连接池
	public static void close(Connection conn){
		try {
			if(conn!=null && !conn.isClosed()){
				System.out.println("之前有"+connList.size()+"个连接");
				connList.add(conn);
				System.out.println("归还了一个连接，现在有"+connList.size()+"个连接");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
