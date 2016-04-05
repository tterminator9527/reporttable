package db;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Db {
	public static Connection getConnection(){
		Connection  connection = null;
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			connection= (Connection) DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_reporttable","5xzjjnx2k1","2m1myxmmzx1y423kyyzlwzy4hxhl52l4kyz4kwxx");
//			connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/unicom7","root","root");
			connection.setAutoCommit(false);
		}
		catch(Exception ex){
				ex.printStackTrace();
		}
		return connection;
	}
}
