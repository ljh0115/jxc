package com.hopu.bms.entiy;

public class Book {
	private int BookNo;//�鼮���
	private String BookName;//�鼮����
	private int BookJG;//�鼮�۸�
	private int BookJF;//�鼮����
	private int BookNumber;//�鼮����
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookJG() {
		return BookJG;
	}
	public void setBookJG(int bookJG) {
		BookJG = bookJG;
	}
	public int getBookJF() {
		return BookJF;
	}
	public void setBookJF(int bookJF) {
		BookJF = bookJF;
	}
	public int getBookNumber() {
		return BookNumber;
	}
	public void setBookNumber(int bookNumber) {
		BookNumber = bookNumber;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNo, String bookName, int bookJG, int bookJF,
			int bookNumber) {
		super();
		BookNo = bookNo;
		BookName = bookName;
		BookJG = bookJG;
		BookJF = bookJF;
		BookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "�鼮��ţ�"+BookNo+"\t"+" �鼮���ƣ�"+BookName+"\t"+" �鼮�۸�"+BookJG+"\t"+"�鼮���֣�"+"\t"+BookJF+"\t"+" �鼮������"+BookNumber;
	}
}
