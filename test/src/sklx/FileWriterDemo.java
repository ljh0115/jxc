package sklx;
/*
FileWriter:����� �ַ��� �ڵ���

 �ַ����Դ������� ��Ҫˢ�»����� 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������ȥ����Ŀ�Ķ�
		File file=new File("E:\\IO\\����ϰ.txt");
		//�ж��ļ��Ƿ����
		if(!file.exists()){
		//��ȡ��Ŀ¼
		File f2=file.getParentFile();
			//�ж�Ŀ¼�Ƿ����
			if(!f2.exists()){
			//������Ŀ¼ ����
				f2.mkdirs();
			}
			//�����ڴ���
			file.createNewFile();
		}
				
		//���������
		FileWriter fw=new FileWriter(file);
		//���������������
		String s="�׳�������";
				
		//д������
//		fw.write(s.toCharArray());
		fw.write(s);
		//ˢ�»�����
//		fw.flush();//
		
		//�ر���
		fw.close();//�Զ�����flush() ˢ�»�����
	}
}
