import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*
 ģ��QQ����  �û������������� ���Ե���ʷ��¼�в鿴��¼ 
 
 InputStreamReader	���ֽ�����ת��Ϊ�ַ�������
 BufferedReader		����
 */
public class lx12 {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\a\\test.txt");
		if (!file.exists()) {
			// ��ȡ��Ŀ¼
			File f = file.getParentFile();
			// �ж�Ŀ¼�Ƿ����
			if (!f.exists()) {
				f.mkdirs();// �����ļ�
			}
			f.createNewFile();
			//���̶�ȡ����
			//��ʽһ����Scanner����	ȫ��
			//Scanner s=new Scanner(System.in);
			//��ʽ��
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//���������	���п�		
			FileWriter fw=new FileWriter(file);
			while (true) {
				//����������Ϣ
				System.out.println("�����룺");
				String str=br.readLine();
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
