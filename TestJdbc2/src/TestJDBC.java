import java.sql.Connection;

public class TestJDBC {
	public static void main(String[] args) {
		//��ȡ����
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			System.out.println("���ӳɹ�");
			/*
			 * ����Statement���� �����ǽ�sql��䷢�͵����ݿ���ִ��
			 * ���÷�����
			 * 1.executeUpdate() ��������ɾ�����
			 * 2.executeQuery() ʹ�����ѯ���
			 * 3.execute() �������κ����͵����
			 * 
			 */
		}finally{
			//�ر���Դ
			JDBCUtil.getClose(conn);
		}
	}
}
