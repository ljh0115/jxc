package com.hopu.bms.entiy;

public class Reader {
	private int ReaderNo;//���߱��
	private String ReaderName;//��������
	private int ReaderJF;//���߻���
	private int ReaderNumber;//���߽����鼮����
	public int getReaderNo() {
		return ReaderNo;
	}
	public void setReaderNo(int readerNo) {
		ReaderNo = readerNo;
	}
	public String getReaderName() {
		return ReaderName;
	}
	public void setReaderName(String readerName) {
		ReaderName = readerName;
	}
	public int getReaderJF() {
		return ReaderJF;
	}
	public void setReaderJF(int readerJF) {
		ReaderJF = readerJF;
	}
	public int getReaderNumber() {
		return ReaderNumber;
	}
	public void setReaderNumber(int readerNumber) {
		ReaderNumber = readerNumber;
	}
	public  Reader(){
		
	}	
	public Reader(int readerNo, String readerName, int readerJF,
			int readerNumber) {
		super();
		ReaderNo = readerNo;
		ReaderName = readerName;
		ReaderJF = readerJF;
		ReaderNumber = readerNumber;
	}
	@Override
	public String toString() {
		return "���߱�ţ�"+ReaderNo+"\t"+"�������ƣ�"+ReaderName+"\t"+"���߻��֣�"+"\t"+ReaderJF+"\t"+"���߽����鼮������"+ReaderNumber;
	}
}
