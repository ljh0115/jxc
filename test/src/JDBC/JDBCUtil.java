package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	//��ȡ����
	public static Connection getConn(){
		Connection conn=null;
		try {
			//����������
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//��������
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TestJdbc","sa","1320217325");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//�ر���Դ
	public static void getClose(Connection c){
		
		if(c!=null){
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
