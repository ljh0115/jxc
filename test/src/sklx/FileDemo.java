package sklx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	����Java.io.File
 		��ʾһ���ļ���Ŀ¼
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//����file����
		File file=new File("E:\\��16�� java IOϵͳ.pptx");
		//��ȡ�ļ���
		System.out.println(file.getName());
		//��ȡ��Ŀ¼
		System.out.println(file.getParent());
		//��ȡ���һ���޸ĵ�ʱ��
		long time=file.lastModified();
		Date date=new Date(time);
		String s=new SimpleDateFormat().format(date);
		System.out.println(s);
		//(����ֵ)
		System.out.println(file.lastModified());
		//ɾ���ļ�
		file.delete();
		//�ڸ�Ŀ¼�´����ļ�
		//�ж��ļ��Ƿ����
		if(file.exists()){
			//�����ڴ���
		file.createNewFile();
		}
		//�ڶ༶Ŀ¼�´����ļ�
		File file2=new File("E:\\a\\��16�� java IOϵͳ.pptx");
		//�ж��ļ��Ƿ����
		if(!file2.exists()){
			//��ȡ��Ŀ¼
			File f2=file2.getParentFile();
			if(!f2.exists()){
				//������Ŀ¼ʱ ����Ŀ¼
				f2.mkdirs();
			}
			//�������ļ�ʱ �����ļ�
			file2.createNewFile();
		}
	}
}
