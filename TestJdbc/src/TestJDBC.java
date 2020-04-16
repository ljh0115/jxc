
import java.sql.DriverManager;
import java.sql.SQLException;

/*

	JDBC�ĸ��

 		��һ���������ݿ�ļ���
 		ʵ����java���ԶԸ������ݿ�ķ���
 		��һЩjava�����д��ͽӿ���� ��JDBC API��
 
 	JDBC�������ݿ⣺
 
 		1.����������
 		2.����������
 			Class.forName("����");
 		3.��ȡ���ݿ�����
			DriverManager.getConnection(url,userName,password);
 */
public class TestJDBC {
	public static void main(String[] args) {
		//������
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//���ӵ�ַ
		String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=TestJDBC";
		//�û���
		String user="sa";
		//����
		String pwd="1320217325";

		try {
			//����������
			Class.forName(driver);
			//��ȡ����
			DriverManager.getConnection(url, user, pwd);
			System.out.println("���ӳɹ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
