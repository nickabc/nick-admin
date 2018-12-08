package test;

import java.sql.Connection;

import jdbc.DataSourcePool;

public class Test1 {

	public static void main(String[] args) {
		Connection conection = DataSourcePool.getConection();
		
		DataSourcePool.close(conection);
	}
}
