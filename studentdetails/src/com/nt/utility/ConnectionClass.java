package com.nt.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	public static  Connection getConnection() throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:VENU", "system", "chilukuru");
		return con;
	}

}
