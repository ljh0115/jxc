
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lx9 {
	public static void main(String[] args) throws IOException {
		// ����file����
		File file = new File("E:\\ͼƬ.jpg");
		// �����ļ�ȥ��Ŀ�ĵ�
		File to = new File("E:\\times\\ͼƬ.jpg");
		// �ж�Ŀ�ĵ��Ƿ����
		if (!to.exists()) {
			// ��ȡ��Ŀ¼
			File f = to.getParentFile();
			// �ж�Ŀ¼�Ƿ����
			if (!f.exists()) {
				f.mkdirs();// �����ļ�
			}
			// ����������
			FileInputStream fis = new FileInputStream(file);
			// ���������
			FileOutputStream fos = new FileOutputStream(to);
			// ����byte��������
			byte[] by = new byte[1024];

			int len = 0;// �������� ���ÿ�ζ�ȡ�ĳ���
			// ѭ����ȡ����
			while ((len = fis.read(by)) != -1) {
				// ѭ��д������
				fos.write(by, 0, len);

			}
			// �ر���
			fos.close();
			fis.close();

		}

	}

}