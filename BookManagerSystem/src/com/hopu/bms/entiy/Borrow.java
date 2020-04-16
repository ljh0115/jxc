package com.hopu.bms.entiy;

public class Borrow {
	private int ReaderNo;//���߱��
	private int BookNo;//�鼮���
	private int BorrowNumber;//��������
	private String BorrowTime;//����ʱ��
	public int getReaderNo() {
		return ReaderNo;
	}
	public void setReaderNo(int readerNo) {
		ReaderNo = readerNo;
	}
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public int getBorrowNumber() {
		return BorrowNumber;
	}
	public void setBorrowNumber(int borrowNumber) {
		BorrowNumber = borrowNumber;
	}
	public String getBorrowTime() {
		return BorrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		BorrowTime = borrowTime;
	}
	public Borrow(){
		
	}
	
	public Borrow(int readerNo, int bookNo, int borrowNumber) {
		super();
		ReaderNo = readerNo;
		BookNo = bookNo;
		BorrowNumber = borrowNumber;
	}
	public Borrow(int readerNo, int bookNo, int borrowNumber, String borrowTime) {
		super();
		ReaderNo = readerNo;
		BookNo = bookNo;
		BorrowNumber = borrowNumber;
		BorrowTime = borrowTime;
	}
	@Override
	public String toString() {
		return	"���߱�ţ�\t" + ReaderNo + "\t�鼮��ţ�" + BookNo + "\t�鼮������\t" + BorrowNumber
				+ "\t����ʱ�䣺\t" + BorrowTime ;
	}
	
}
