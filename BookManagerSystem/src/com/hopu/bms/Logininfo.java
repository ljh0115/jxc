package com.hopu.bms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import com.hopu.bms.entiy.Book;
import com.hopu.bms.entiy.Borrow;
import com.hopu.bms.entiy.Login;
import com.hopu.bms.entiy.Reader;
import com.hopu.bms.ui.BookMUI;
import com.hopu.bms.ui.LoginUI;
import com.hopu.bms.util.JDBCUtil;

//����Ա��Ϣ�߼�����
public class Logininfo {
	//ע���û�
	public static boolean login1(Login a) throws SQLException {
		//����û�и��û�����
		boolean bn=false;
		Connection conn=JDBCUtil.getConn();
		//��ѯ�Ƿ��и��û�
		String sql="select*from Logininfo";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			//������˺���������ݿ����˺�����Ƚ�
			boolean b1=rs.getString(1).equals(a.getUserName());
			boolean b2=rs.getString(2).equals(a.getPwd());
			//�˺�����ͬʱ���ʱ ����ɹ�
			if(b1==true&&b2==true){
				bn=true;
			}else{
				//����û������� �����û�
				Login lo1=new Login();
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logininfo values(?,?)";//�������
				PreparedStatement pst1=conn1.prepareStatement(sql1);
				pst1.setString(1,lo1.getUserName());
				pst1.setString(2,lo1.getPwd());
				pst1.executeUpdate();
			}
		}
		return bn;
	}
	//��¼ ��������Ա������˺ź�����
	public static boolean login(Login a) throws SQLException {
		//�����¼ʧ��
		boolean bn=false;
		//�������ݿ�
		Connection conn=JDBCUtil.getConn();
		//��ѯ�Ƿ��и��û�
		String sql="select*from Logininfo";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			//������˺���������ݿ����˺�����Ƚ�
			boolean b1=rs.getString(1).equals(a.getUserName());
			boolean b2=rs.getString(2).equals(a.getPwd());
			//�˺�����ͬʱ���ʱ ����ɹ�
			if(b1==true&&b2==true){
				bn=true;//��¼�ɹ�
			break;
			}
		}
		return bn;
	}
	//���˵�
	public static boolean login2() throws SQLException {
		BookMUI.bookMUI1();
		return false;
	}
	//�����鼮����
	public static boolean login2_1() throws SQLException {
		BookMUI.bookMUI2();
		return false;
	}
	//������߹���
	public static boolean login2_2() throws SQLException {
		BookMUI.bookMUI3();
		return false;
	}
	//�����鼮����
	public static boolean login2_3() throws SQLException {
		BookMUI.bookMUI4();
		return false;
	}
	//��ѯ�鼮
	public static void login2_21() throws SQLException {
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//�������� ���SQL���
			String s="select * from Logbook";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(s);
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//����list�洢���ݿ��������鼮��Ϣ һ����¼��Ӧһ�������
			ArrayList<Book> list=new ArrayList<Book>();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			while(rs.next()){
				Book bok=new Book();
				bok.setBookNo(rs.getInt(1));
				bok.setBookName(rs.getString(2));
				bok.setBookJG(rs.getInt(3));
				bok.setBookJF(rs.getInt(4));
				bok.setBookNumber(rs.getInt(5));
				list.add(bok);
			}
			//���ϱ���
			for (Book book : list) {
				System.out.println(book);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Scanner s=new Scanner(System.in);
		System.out.println("�Ƿ�ѡ����������鼮��"+"��ѡ��(yes/no)");
		String x="yes";
		String y="no";
		String z=s.next();
		//equals�ǵ��ڵ���˼
		if(z.equals(x)){
			LoginUI.loginUI2_1();
		}else if(z.equals(y)){
			LoginUI.loginUI();
			LoginUI.loginUI2();
		}else{
			System.out.println("������ѡ��");
		}
	}
	//�����鼮
	public static boolean login2_22(Book b) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//�������� ���SQL���
			String st="select * from Logbook where BookName=?";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(st);
			 pst.setString(1, b.getBookName());
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			if(rs.next()){
				String sql="update Logbook set BookNumber=BookNumber+? where BookName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, b.getBookNumber());
				pst1.setString(2, b.getBookName());
				pst1.executeUpdate();
					bn=true;
			}else{
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logbook values(?,?,?,?,?)";//�������
				PreparedStatement pst2=conn1.prepareStatement(sql1);
				pst2.setInt(1,b.getBookNo());
				pst2.setString(2,b.getBookName());
				pst2.setInt(3,b.getBookJG());
				pst2.setInt(4,b.getBookJF());
				pst2.setInt(5,b.getBookNumber());
				pst2.executeUpdate();
				}			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//�޸��鼮��Ϣ
	public static boolean login2_23(Book b1,Book b2) throws SQLException {
		//�����޸�ʧ��
		boolean bn=false;
		Connection conn=null;
		conn=JDBCUtil.getConn();
		//����String���ͱ���  �������� ���SQL���  ��ʾ��ѯ����ָ�������鼮
		String st="select * from Logbook where BookNo=? and BookName=?";
		//��SQL�������ݿ���
		PreparedStatement pst;
		try {
			pst=conn.prepareStatement(st);
			//��ռλ����ֵ
			pst.setInt(1,b1.getBookNo());
			pst.setString(2,b1.getBookName());
		//ִ��SQL��� �õ�����SQL������� ���ڽ������
		ResultSet rs=pst.executeQuery();
		//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0�� ��������Ƿ��м�¼		
		if(rs.next()){
			String sql="update Logbook set BookName=?,BookJG=?,BookJF=?,BookNumber=? where BookNo=?";
			PreparedStatement pst1=conn.prepareStatement(sql);
			pst1.setString(1,b2.getBookName());
			pst1.setInt(2, b2.getBookJG());
			pst1.setInt(3, b2.getBookJF());
			pst1.setInt(4, b2.getBookNumber());				
			pst1.setInt(5, b1.getBookNo());
			pst1.executeUpdate();
			//��ʾҪ�޸ĵ��鼮�Ѿ�����
			bn=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			return bn;
	}
	//ɾ���鼮��Ϣ
	public static  boolean login2_24(Book b) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//���Զ��ύ����ر�
			conn.setAutoCommit(false);
			//�������� ���SQL���
			String st="select * from Logbook where BookNo=? and BookName=?";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(st);
			pst.setInt(1, b.getBookNo());
			pst.setString(2, b.getBookName());
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			if(rs.next()){
				String sql="delete from Logbook where BookNo=? and BookName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, b.getBookNo());
				pst1.setString(2, b.getBookName());	
				pst1.executeUpdate();
				bn=true;
			}
			//�ֶ��ύ����
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();//�ع�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//��ѯ������Ϣ
	public static void login2_31() throws SQLException {
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//�������� ���SQL���
			String s="select * from Logreader";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(s);
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//����list�洢���ݿ������ж�����Ϣ һ����¼��Ӧһ�����߶���
			ArrayList<Reader> list=new ArrayList<Reader>();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			while(rs.next()){
				Reader read=new Reader();
				read.setReaderNo(rs.getInt(1));
				read.setReaderName(rs.getString(2));
				read.setReaderJF(rs.getInt(3));
				read.setReaderNumber(rs.getInt(4));
				list.add(read);
			}
			//���ϱ���
			for (Reader read : list) {
				System.out.println(read);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Scanner s=new Scanner(System.in);
		System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
		String x="yes";
		String y="no";
		String z=s.next();
		//equals�ǵ��ڵ���˼
		if(z.equals(x)){
			LoginUI.loginUI2_2();
		}else if(z.equals(y)){
			LoginUI.loginUI();
			LoginUI.loginUI2();
		}else{
			System.out.println("������ѡ��");
		}
	}
	//����������Ϣ
	public static boolean login2_32(Reader r) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//�������� ���SQL���
			String st="select * from Logreader where ReaderName=?";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(st);
			 pst.setString(1, r.getReaderName());
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			if(rs.next()){
					bn=true;
			}else{
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logreader values(?,?,?,?)";//�������
				PreparedStatement pst2=conn1.prepareStatement(sql1);
				pst2.setInt(1,r.getReaderNo());
				pst2.setString(2,r.getReaderName());				
				pst2.setInt(3,r.getReaderJF());
				pst2.setInt(4,r.getReaderNumber());
				pst2.executeUpdate();
				}			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//�޸Ķ�����Ϣ
	public static boolean login2_33(Reader r1,Reader r2) throws SQLException {
		//�����޸�ʧ��
		boolean bn=false;
		Connection conn=null;
		conn=JDBCUtil.getConn();
		//����String���ͱ���  �������� ���SQL���  ��ʾ��ѯ����ָ��������
		String st="select * from Logreader where ReaderNo=? and ReaderName=?";
		//��SQL�������ݿ���
		PreparedStatement pst;
		try {
			pst=conn.prepareStatement(st);
			//��ռλ����ֵ
			pst.setInt(1,r1.getReaderNo());
			pst.setString(2,r1.getReaderName());
		//ִ��SQL��� �õ�����SQL������� ���ڽ������
		ResultSet rs=pst.executeQuery();
		//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0�� ��������Ƿ��м�¼		
		if(rs.next()){
			String sql="update Logreader set ReaderName=?,ReaderJF=?,ReaderNumber=? where ReaderNo=?";
			PreparedStatement pst1=conn.prepareStatement(sql);
			pst1.setString(1,r2.getReaderName());
			pst1.setInt(2, r2.getReaderJF());
			pst1.setInt(3, r2.getReaderNumber());
			pst1.setInt(4, r1.getReaderNo());				
			pst1.executeUpdate();
			//��ʾҪ�޸ĵĶ����Ѿ�����
			bn=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			return bn;
	}
	//ɾ��������Ϣ
	public static  boolean login2_34(Reader r) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//���Զ��ύ����ر�
			conn.setAutoCommit(false);
			//�������� ���SQL���
			String st="select * from Logreader where ReaderNo=? and ReaderName=?";
			//��SQL�������ݿ���
			PreparedStatement pst=conn.prepareStatement(st);
			pst.setInt(1, r.getReaderNo());
			pst.setString(2, r.getReaderName());
			//ִ��SQL���
			ResultSet rs=pst.executeQuery();
			//�жϽ��������һ���Ƿ�����Ч�� Ĭ��ָ���0��
			if(rs.next()){
				String sql="delete from Logreader where ReaderNo=? and ReaderName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, r.getReaderNo());
				pst1.setString(2, r.getReaderName());	
				pst1.executeUpdate();
				bn=true;
			}
			//�ֶ��ύ����
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();//�ع�
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//�鼮����
	public static  boolean login2_41(Borrow bo) throws SQLException {
		//����ʧ��
		boolean bn=false;
		Connection conn=null;
		try {
		conn=JDBCUtil.getConn();
		String sql1="select BookNo from Logbook where BookNo=?";//��ѯ�鼮���е�ͼ������
		String sql2="update Logbook set BookNumber=BookNumber-? where BookNo=?";//�������һ ������ô���������Ǳ��������һ
		PreparedStatement pst1=conn.prepareStatement(sql1);	
		PreparedStatement pst2=conn.prepareStatement(sql2);	
		pst1.setInt(1, bo.getBookNo());
		//ִ��SQL���
		ResultSet rs=pst1.executeQuery();
		if(rs.next()){
			String sql3="select ReaderNo from Logreader where ReaderNo=?";//����
			String sql4="update Logreader set ReaderNumber=ReaderNumber+? where ReaderNo=?";
			PreparedStatement pst3=conn.prepareStatement(sql3);
			PreparedStatement pst4=conn.prepareStatement(sql4); 
			pst3.setInt(1,bo.getReaderNo());
			ResultSet rs2=pst3.executeQuery();			
			if (rs2.next()){					
				if(bo.getBorrowNumber()<0){
				String sql5="select *from Logbook where BookNo=?";//1 ��Ѯ���ж��鼮����ĳ����������ж���
				PreparedStatement pst5=conn.prepareStatement(sql5);
				pst5.setInt(1,bo.getBookNo());
				ResultSet rs5=pst5.executeQuery();
				rs5.next();
				if(bo.getBorrowNumber()>5){
					pst4.setInt(1, bo.getBorrowNumber());
					pst4.setInt(2, bo.getReaderNo());
					pst4.executeUpdate();
					pst2.setInt(1, bo.getBorrowNumber());
					pst2.setInt(2, bo.getBookNo());
					pst2.executeUpdate();
					String sql="insert into Logborrow values(?,?,?,getdate())";
					PreparedStatement pst=conn.prepareStatement(sql);	
					pst.setInt(1, bo.getReaderNo());
					pst.setInt(2, bo.getBookNo());
					pst.setInt(3, bo.getBorrowNumber());
					pst.executeUpdate();
					bn=true;}
				else{//�Զ����쳣
					throw new AmountLT2Exception();
				}
				}else{
					throw new AmountLT0Exception();
				}
				}else{
					throw new AmountLTException();
				}
				}else{
					throw new AmountLT1Exception();
				}				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}					
		return bn;	
	}
	
	
	//���ļ�¼
	public static  boolean login2_42() throws SQLException {
		//����ʧ��
		Connection con = null;
		con = JDBCUtil.getConn();
		Scanner scanner = new Scanner(System.in);
		try 
		{
			String s1 = "select * from Logborrow";
			PreparedStatement x1;
			x1 = con.prepareStatement(s1);
			ResultSet rs = x1.executeQuery();
			
			ArrayList<Borrow> list=new ArrayList<Borrow>();
			while(rs.next())
			{
				Borrow bo = new Borrow();
				bo.setReaderNo(rs.getInt(1));
				bo.setBookNo(rs.getInt(2));
				bo.setBorrowNumber(rs.getInt(3));
				bo.setBorrowTime(rs.getString(4));
				list.add(bo);
			}			
			for (Borrow x : list)
			{
				System.out.println(x);
			}			
			while(true){
				System.out.println("�Ƿ���������鼮?(yes/no)");
				String x=scanner.next();
				if(x.equals("yes")){
					break;
				}else if(x.equals("no")){
					break;
				}else{
					System.out.println("��������!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
	class AmountLT2Exception extends RuntimeException{
		public AmountLT2Exception(){
			super("�����鼮���������쳣");	
		}
	}
	class AmountLT0Exception extends RuntimeException{
		public AmountLT0Exception(){
			super("�����鼮���������쳣");	
		}
	}
	class AmountLTException extends RuntimeException{
		public AmountLTException(){
			super("���߱�Ų�����");	
		}
	}
	class AmountLT1Exception extends RuntimeException{
		public AmountLT1Exception(){
			super("�鼮��Ų�����");	
		}
	}

