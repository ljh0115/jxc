package FileOutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	TestInputStream1:	����� �ֽ��� �ڵ���
 */
public class TestOutputStream1 {
	private static boolean turn;

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\a\\test1.txt");
		//�ж��ļ��Ƿ����
		if(!file.exists()){
			//��ȡ��Ŀ¼
			File f=file.getParentFile();
			if(!f.exists()){
				//������Ŀ¼ʱ ����Ŀ¼
				f.mkdirs();
			}
			//�������ļ�ʱ �����ļ�
			file.createNewFile();
		}
		//���������
		//FileOutputStream fos=new FileOutputStream(file);//����
		FileOutputStream fos=new FileOutputStream(file,turn);//��д
		//���������������
		String s="1354";
		//д������
		fos.write(s.getBytes());
		//�ر���
		fos.close();
	}
}
