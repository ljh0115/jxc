package UtilDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC3 {
	public static void main(String[] args) throws SQLException {
	//��ȡ����
	Connection conn=TestUtil.getConn();
	//ʹ��PreparedStatement���� ʹ�ã���Ϊռλ��  ͨ��setXXX(index,value)��ֵ
	//��������
	String sql="insert into stuinfo values(?,?,?)";
	PreparedStatement pst=conn.prepareStatement(sql);
	pst.setInt(1, 3);
	pst.setString(2,"����");
	pst.setString(3,"��");
	pst.executeUpdate();
	//�޸�
	String f1="update stuinfo set stuName=? where stuId=?";
	PreparedStatement f2=conn.prepareStatement(f1);
	f2.setString(1,"������");
	f2.setInt(2,1003);
	f2.executeUpdate();
	//ɾ��
	String f3="delete from Stuinfo where stuId=? ";
	PreparedStatement f4=conn.prepareStatement(f3);
	f4.setInt(1, 1003);
	f4.executeUpdate();
	//��ѯ
	String f5="select*from stuinfo";
	PreparedStatement f6=conn.prepareStatement(f5);
	ResultSet rs = f6.executeQuery();
     //�������
     while(rs.next()) {
         //���� Users ���� �и� stuName ��
         System.out.println("stuName ---"+rs.getString("stuName")+"\t"+"stuId ---"+rs.getString("stuId"));
     }
	}
	
}
