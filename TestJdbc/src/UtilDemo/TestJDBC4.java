package UtilDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBC4 {
	public static void main(String[] args) throws SQLException {
		//��ȡ����
		Connection conn=TestUtil.getConn();
		//ģ�����
		Scanner s=new Scanner(System.in);
		System.err.println("�������˺ţ�");
		String user=s.next();
		System.out.println("���������룺");
		String pwd=s.next();
		String sql="select*from Users where user_name=? and user_pwd=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,user);
		ps.setString(2,pwd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
	}
}
