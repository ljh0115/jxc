package com.hopu.bms.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.hopu.bms.Logininfo;
	
public class BookMUI {
	//ͼ�����ϵͳ������
	public static void bookMUI() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************��ë����ͼ�����ϵͳ******************");
			System.out.println("1.ע��");
			System.out.println("2.��¼");
			System.out.println("3.�˳�ϵͳ");
			int i=s.nextInt();
			if(i==1){
				//����ע�����
			LoginUI.loginUI1();	
			}else if(i==2){
				//�����¼����
			LoginUI.loginUI();
			LoginUI.loginUI2();
			}else if(i==3){
				//�˳�ϵͳ
				System.out.println("�ݰ�������");
				break;
			}else{
				System.out.println("�������������²���");
			}
		}
	}	
		public static void bookMUI1() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************��ӭ�������˵�******************");
			System.out.println("1.�鼮����");
			System.out.println("2.���߹���");
			System.out.println("3.�鼮����");
			System.out.println("4.�˳�ϵͳ");
			int i=s.nextInt();
			if(i==1){
				//�����鼮�������
			LoginUI.loginUI2_1();	
			}else if(i==2){
				//������߹������
			LoginUI.loginUI2_2();
			}else if(i==3){
				//�����鼮���Ľ���
			LoginUI.loginUI2_3();
			}
			else if(i==4){
				//�˳�ϵͳ
				System.out.println("�ݰ�������");
				break;
			}else{
				System.out.println("�������������²���");
			}
		}	
	}
	public static void bookMUI2() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************��ӭ�����鼮����*****************");
			System.out.println("1.�鿴�鼮��Ϣ");
			System.out.println("2.�����鼮��Ϣ");
			System.out.println("3.�޸��鼮��Ϣ");
			System.out.println("4.ɾ���鼮��Ϣ");
			System.out.println("5.�������˵�");
			int i=s.nextInt();
			if(i==1){
				//����鿴�鼮��Ϣ 
			Logininfo.login2_21();	
			}else if(i==2){
				//���� �����鼮��Ϣ
			LoginUI.loginUI2_22();
			}else if(i==3){
				//���� �޸��鼮��Ϣ
			LoginUI.loginUI2_23();
			}else if(i==4){
				//���� �޸��鼮��Ϣ
			LoginUI.loginUI2_24();
			}else if(i==5){
				//�������˵�
				System.out.println("�������˵�");
				break;
			}else{
				System.out.println("�������������²���");
			}
		}	
	}
	public static void bookMUI3() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************��ӭ������߹���*****************");
			System.out.println("1.�鿴������Ϣ");
			System.out.println("2.����������Ϣ");
			System.out.println("3.�޸Ķ�����Ϣ");
			System.out.println("4.ɾ��������Ϣ");
			System.out.println("5.�������˵�");
			int i=s.nextInt();
			if(i==1){
				//����鿴������Ϣ 
			Logininfo.login2_31();
			}else if(i==2){
				//���� ����������Ϣ
			LoginUI.loginUI2_32();	
			}else if(i==3){
				//���� �޸Ķ�����Ϣ
			LoginUI.loginUI2_33();
			}else if(i==4){
				//���� �޸Ķ�����Ϣ
			LoginUI.loginUI2_34();
			}else if(i==5){
				//�������˵�
				System.out.println("�������˵�");
				break;
			}else{
				System.out.println("�������������²���");
			}
		}	
	}
	public static void bookMUI4() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************��ӭ�����鼮����*****************");
			System.out.println("1.�鼮����");
			System.out.println("2.��ѯ�鼮���ļ�¼");
			System.out.println("3.�������˵�");
			int i=s.nextInt();
			if(i==1){
				//�����鼮���Ĺ���
			LoginUI.loginUI2_41();
			}else if(i==2){
				//�����ѯ�鼮���ļ�¼
			LoginUI.loginUI2_42();
			}else if(i==5){
				//�������˵�
				System.out.println("�������˵�");
				break;
			}else{
				System.out.println("�������������²���");
			}
		}	
	}
}
