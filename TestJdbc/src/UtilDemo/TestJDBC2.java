package UtilDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {
	public static void main(String[] args) {
		//��ȡ����
		Connection conn=null;
		try {
			conn=TestUtil.getConn();
			System.out.println("���ӳɹ�");
			//����Statement����
			Statement st=conn.prepareStatement(null);
			String sql="select*from TestJdbc";
			ResultSet rs=st.executeQuery(sql);
			/*
			 * 	ResultSet ִ�в�ѯ���� �õ������
			 * 	���÷�����next()
			 *  1.�����ִ����һ��  Ĭ��ָ����ǵ�һ��֮ǰ
			 *  2.������ִ������Ч�� ����true ���򷵻�false
			 */
			while(rs.next()){
				//ʹ��getXXX(�ڼ���)��getXXX("����")
				System.out.println(rs.getInt(1)+"\t"+rs.getString("stuName")+"\t"+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			//�ر���Դ
			TestUtil.getClose(conn);
		}
	}
}
