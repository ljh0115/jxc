import java.io.*;
/*
  1.���ַ����������� ����һ���ĵ���д���ӣ�
 */
public class lx10 {
	public static void main(String[] args) throws IOException {
		// ����file����
		File file = new File("E:\\a\\test.txt");
		// �����ļ�ȥ��Ŀ�ĵ�
		File to = new File("E:\\times\\test.txt");
		// �ж�Ŀ�ĵ��Ƿ����
		if (!to.exists()) {
			// ��ȡ��Ŀ¼
			File f = to.getParentFile();
			// �ж�Ŀ¼�Ƿ����
			if (!f.exists()) {
				f.mkdirs();// �����ļ�
			}
			// ����������
			FileReader rd= new FileReader(file);
			// ���������
			FileWriter fw = new FileWriter(to);
			//��д����
			  int read = rd.read();
	            while(read != -1){
	                fw.write(read);
	                read = rd.read();
			}
			//ˢ�»�����
			fw.flush();
			// �ر���
			fw.close();
			rd.close();
		}
		System.out.println("���Ƴɹ�");
	}
} 
