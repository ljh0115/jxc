package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream2 {
	public static void main(String[] args) throws IOException {
		//��������ȡ���ļ�
		File file =new File("E:\\a\\test.txt");
		//����������
		FileInputStream fis=new FileInputStream(file);
		//����byte[]����
		byte[] by=new byte[1024];//1024��ȡ�ٶ����
		//�������� ���ÿ�ζ�ȡ����
		int len=0;
		//ѭ����ȡ
		while((len=fis.read(by))!=-1){//1120
			//��ÿ�ζ�ȡ�ĳ�������ת��Ϊ�ַ���
			String s=new String(by,0,len);
			System.out.println(s);
		}
		fis.close();
	}
}
