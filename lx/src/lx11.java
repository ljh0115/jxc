import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 �ӿ���̨�������ݣ�д�뵽�ļ��У�
 ����exit��ʾ����д�ļ�����. 
 */
public class lx11 {
	public static void main(String[] args) throws IOException {
		//��������ȥ����Ŀ�ĵ�
		File file=new File("E:\\a\\test.txt");
		if (!file.exists()) {
			// ��ȡ��Ŀ¼
			File f = file.getParentFile();
			// �ж�Ŀ¼�Ƿ����
			if (!f.exists()) {
				f.mkdirs();// �����ļ�
			}
			f.createNewFile();
			//����Scanner����
			Scanner s=new Scanner(System.in);
			//���������
			FileWriter fw=new FileWriter(file);
			while (true) {
				//����������Ϣ
				System.out.println("�����룺");
				String str=s.nextLine();
				//�ж�����������Ƿ�Ϊexit
				if (str.equals("exit")) {
					break;
				}
				//д�����ݵ�ָ���ļ�
				fw.write(str);
				//ˢ��
				fw.flush();
			}
		}
	}
}
