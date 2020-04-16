package com.hopu.bms.ui;


import java.sql.SQLException;
import java.util.Scanner;


import com.hopu.bms.Logininfo;
import com.hopu.bms.entiy.Book;
import com.hopu.bms.entiy.Borrow;
import com.hopu.bms.entiy.Login;
import com.hopu.bms.entiy.Reader;

public class LoginUI {
	//ע�����
	public static void loginUI1() throws SQLException{
		System.out.println("��ӭ����ע�����");
		Scanner s=new Scanner(System.in);
		System.out.println("�������˺�");
		String user=s.next();
		System.out.println("����������");
		String pwd=s.next();
		//����Login���� ���ǰ̨��������
		Login lo=new Login();
		lo.setUserName(user);
		lo.setPwd(pwd);
		//��ǰ̨�����ݷ�װ����� ������̨����
		boolean bn=Logininfo.login(lo);
		//���÷��� �ж��Ƿ��и��˺�
		//������û������ݿ�
		if(bn==true){
			System.out.println("ע��ʧ��,���û��Ѵ���,������ע��");
		}else{
			System.out.println("ע��ɹ�");
		}
		}
	//��¼����
	public static void loginUI() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("�������˺�");
		String user=s.next();
		System.out.println("����������");
		String pwd=s.next();
		//����Login���� ���ǰ̨��������
		Login lo=new Login();
		lo.setUserName(user);
		lo.setPwd(pwd);
		//��ǰ̨�����ݷ�װ����� ������̨����
		boolean bn=Logininfo.login(lo);
		//���÷��� �ж��Ƿ��и��˺�
		if(bn==true){
			System.out.println("��¼�ɹ�");
			//���÷��� �������˵�
			BookMUI.bookMUI1();
		}else{
			System.out.println("��¼ʧ��,������һ��");
			BookMUI.bookMUI();
		}
	}
	public static void loginUI2() throws SQLException {
		//���÷��� �ж��Ƿ��¼�ɹ�
		if(Logininfo.login2()){
			System.out.println("��½ʧ��");
			//���÷��� �������˵�
		}else{
			System.out.println("��¼�ɹ�");
		}
	}
	public static void loginUI2_1() throws SQLException {
		//���÷��� �ж��Ƿ��¼�ɹ�
		if(Logininfo.login2_1()){
			System.out.println("��½ʧ��");
			//���÷��� �����鼮����
		}else{
			System.out.println("��¼�ɹ�");
		}
	}
	public static void loginUI2_2() throws SQLException {
		//���÷��� �ж��Ƿ��¼�ɹ�
		if(Logininfo.login2_2()){
			System.out.println("��½ʧ��");
			//���÷��� ������߹���
		}else{
			System.out.println("��¼�ɹ�");
		}
	}
	public static void loginUI2_3() throws SQLException {
		//���÷��� �ж��Ƿ��¼�ɹ�
		if(Logininfo.login2_3()){
			System.out.println("��½ʧ��");
			//���÷��� �����鼮����
		}else{
			System.out.println("��¼�ɹ�");
		}
	}	
	//�����鼮��Ϣ
	public static void loginUI2_22() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("�������鼮��ţ�");
		int bookNo=s.nextInt();
		System.out.println("�������鼮���ƣ�");
		String bookName=s.next();
		System.out.println("�������鼮�۸�");
		int bookJG=s.nextInt();
		System.out.println("�������鼮���֣�");
		int bookJF=s.nextInt();
		System.out.println("�������鼮������");
		int bookNumber=s.nextInt();
		//����Book���� ���ǰ̨��������
		Book b=new Book(bookNo, bookName, bookJG, bookJF, bookNumber);
		//��ǰ̨�����ݷ�װ����� ������̨����			
		//������鼮�����ݿ�
		if(Logininfo.login2_22(b)){
			System.out.println("�鼮�Ѵ���,��������");
		}else{
			System.out.println("�����鼮��Ϣ�ɹ�");
		}
		while(true){
			System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("��������!");
			}
		}
	}
	//�޸��鼮��Ϣ
	public static void loginUI2_23() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("������ԭ�鼮��ţ�");
		int bookNo1=s.nextInt();
		System.out.println("������ԭ�鼮���ƣ�");
		String bookName1=s.next();
		System.out.println("���������鼮��ţ�");
		int bookNo=s.nextInt();
		System.out.println("���������鼮���ƣ�");
		String bookName=s.next();
		System.out.println("�����������ݼ۸�");
		int bookJG=s.nextInt();
		System.out.println("���������鼮���֣�");
		int bookJF=s.nextInt();
		System.out.println("���������鼮������");
		int bookNumber=s.nextInt();
		//��ǰ̨������鼮��Ϣ ������һ������ 
		//����Book���� ���ǰ̨��������
		//Ҫ�޸ĵ��鼮��Ϣ
		Book b1=new Book();
		b1.setBookNo(bookNo1);
		b1.setBookName(bookName1);
		//�޸ĺ���鼮��Ϣ
		Book b2=new Book(bookNo, bookName, bookJG, bookJF, bookNumber);		
		//�������鼮��Ϣ���󴫵���̨���д���
		boolean bn=Logininfo.login2_23(b1,b2);
		//�ж�����鼮�ɹ�����ʧ��
		if(bn==true){
			System.out.println("�޸��鼮��Ϣ�ɹ�");				
		}else{
			System.out.println("�޸��鼮��Ϣʧ��,���鼮������");
		}
		while(true){
			System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("��������!");
			}
		}
	}
	//��ɾ���鼮��Ϣ
	public static void loginUI2_24() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫɾ�����鼮��ţ�");
		int bookNo=s.nextInt();
		System.out.println("������Ҫɾ�����鼮���ƣ�");
		String bookName=s.next();
		//����Book���� ���ǰ̨��������
		Book b=new Book();
		b.setBookNo(bookNo);
		b.setBookName(bookName);
		//��ǰ̨�����ݷ�װ����� ������̨����	
		boolean bn=Logininfo.login2_24(b);
		if(bn==true){
			System.out.println("ɾ���鼮��Ϣ�ɹ�");
		}else{
			System.out.println("ɾ���鼮��Ϣʧ�� ,���鼮������");
		}
		while(true){
			System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("��������!");
			}
		}
	}
	//����������Ϣ
	public static void loginUI2_32() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("��������߱�ţ�");
		int ReaderNo=s.nextInt();
		System.out.println("������������ƣ�");
		String ReaderName=s.next();
		System.out.println("��������߻��֣�");
		int ReaderJF=s.nextInt();
		System.out.println("��������߽����鼮������");
		int ReaderNumber=s.nextInt();
		//����Reader���� ���ǰ̨��������
		Reader r=new Reader(ReaderNo,ReaderName , ReaderJF, ReaderNumber);
		//��ǰ̨�����ݷ�װ����� ������̨����			
		//������鼮�����ݿ�
		if(Logininfo.login2_32(r)){
			System.out.println("���ʧ�ܣ������Ѵ���");
		}else{
			System.out.println("���Ӷ�����Ϣ�ɹ�");
		}
		while(true){
			System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("��������!");
			}
		}
	}
	//�޸Ķ�����Ϣ
	public static void loginUI2_33() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("������ԭ���߱�ţ�");
		int readerNo1=s.nextInt();
		System.out.println("������ԭ�������ƣ�");
		String readerName1=s.next();
		System.out.println("�������¶��߱�ţ�");
		int readerNo=s.nextInt();
		System.out.println("�������¶������ƣ�");
		String readerName=s.next();		
		System.out.println("�������¶��߻��֣�");
		int readerJF=s.nextInt();
		System.out.println("�������¶��߽����鼮������");
		int readerNumber=s.nextInt();
		//��ǰ̨������鼮��Ϣ ������һ������ 
		//����Reader���� ���ǰ̨��������
		//Ҫ�޸ĵ��鼮��Ϣ
		Reader r1=new Reader();
		r1.setReaderNo(readerNo1);
		r1.setReaderName(readerName1);
		//�޸ĺ���鼮��Ϣ
		Reader r2=new Reader(readerNo, readerName, readerJF, readerNumber);		
		//�������鼮��Ϣ���󴫵���̨���д���
		boolean bn=Logininfo.login2_33(r1,r2);
		//�ж�����鼮�ɹ�����ʧ��
		if(bn==true){
			System.out.println("�޸Ķ�����Ϣ�ɹ�");				
		}else{
			System.out.println("�޸Ķ�����Ϣʧ��,�ö��߲�����");
		}
		while(true){
			System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("��������!");
			}
		}
	}
	//��ɾ��������Ϣ
	public static void loginUI2_34() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("������Ҫɾ���Ķ��߱�ţ�");
		int ReaderNo=s.nextInt();
		System.out.println("������Ҫɾ���Ķ������ƣ�");
		String ReaderName=s.next();
		//����Reader���� ���ǰ̨��������
		Reader r=new Reader();
		r.setReaderNo(ReaderNo);
		r.setReaderName(ReaderName);
		//��ǰ̨�����ݷ�װ����� ������̨����	
		boolean bn=Logininfo.login2_34(r);
		if(bn==true){
			System.out.println("ɾ��������Ϣ�ɹ�");
		}else{
			System.out.println("ɾ��������Ϣʧ�� ,���鼮������");
		}
		while(true){
		System.out.println("�Ƿ�ѡ�����������ߣ�"+"��ѡ��(yes/no)");
		Scanner x=new Scanner(System.in);
		if(x.equals("yes")){
			break;
		}else if(x.equals("no")){
			break;
		}else{
			System.out.println("��������!");
		}
		}
	}
	public static void loginUI2_41() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("��������߱�ţ�");
		int ReaderNo=s.nextInt();
		System.out.println("������ö��ߵ��鼮��ţ�");
		int BookNo=s.nextInt();
		System.out.println("������Ҫ���ĵ��鼮������");
		int BookNumber=s.nextInt();
		//�������� ���ǰ̨��������
//		Reader r=new Reader();
//		r.setReaderNo(ReaderNo);
//		Book b=new Book();
//		b.setBookNumber(BookNumber);
//		b.setBookNo(BookNo);
		Borrow bo=new Borrow(ReaderNo, BookNo,BookNumber);
		
		//�����н�����Ϣ���󴫵���̨���д���
		boolean bn=Logininfo.login2_41(bo);
		if(bn==true){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	public static void loginUI2_42() throws SQLException{
		System.out.println("�鿴�鼮������Ϣ");
		Logininfo.login2_42();		
	}
}
