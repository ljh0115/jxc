package sklx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 	FileReader:����� �ַ���
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//��������ȡ���ļ�
		File file =new File("E:\\a\\test.txt");
		//����������
		FileReader fis=new FileReader(file);
		//����byte[]����
		char[] ch=new char[1024];//1024��ȡ�ٶ����
		//�������� ���ÿ�ζ�ȡ����
		int len=0;
		//ѭ����ȡ
		while((len=fis.read(ch))!=-1){//1120
			//��ÿ�ζ�ȡ�ĳ�������ת��Ϊ�ַ���
			String s=new String(ch,0,len);
			System.out.println(s);
		}
		//�ر���
		fis.close();
	}
}
