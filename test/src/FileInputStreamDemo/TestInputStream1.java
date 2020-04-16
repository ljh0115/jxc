package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
  ���ĸ��
  		���������豸������ݴ���
  		���ı��ʾ������ݴ���
 ���ķ��ࣺ
 		1.���� �ѳ�����Ϊ�ο�
 			��������������Դ��ȡ��������
 			�������������������д��ָ���ļ���
 		2.�����������ͣ�
 			�ֽ�������Stream��β ���ֽ�Ϊ��λ���ݴ���
 			�ַ�������Reader��Writer���ַ�Ϊ��λ���ݴ���
 		3.���ܣ�
 			�ڵ������߱������ݴ�һ�˴��䵽��һ�˹���
 			������(������)�����߱����ݴ��书�� ��ҪΪ�ڵ�����ӹ���
 			
 TestInputStream�������� �ֽ��� �ڵ���
 */
public class TestInputStream1 {
	public static void main(String[] args) throws IOException {
		//��������ȡ���ļ�
		File file =new File("E:\\a\\test.txt");
		//����������
		FileInputStream fis=new FileInputStream(file);
		//����byte[]����
		// byte[(int)file.length()];�ļ����ֽڳ���
		byte[] by=new byte[1024];//1024��ȡ�ٶ����
		//��ȡ����
		fis.read(by);
		//byte[]ת��ΪString
		String s=new String(by);
		System.out.println(s);
		//�ر���
		fis.close();
	}
}
