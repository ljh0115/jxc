package DateDemo;

import java.util.Calendar;
	/**
	 * java.util.Calendar��
	 * ������ ��ȡһ��˲���Ӧ������Ϣ
	 * Calendar�ǳ����� ����ֱ��ʵ��������
	 * ����ͨ���Լ����෽����ȡ���Ͷ���
	 * static Calendar getInstance()
	 * ���÷�����
	 * 		int get(int field)��ȡָ���ֶ�
	 * 		
	 */
public class TestCalendar {
	public static void main(String[] args) {
		//������������
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		//�޸���������
		c.set(2016,2,1);
		//ƫ��ʱ��
		c.add(Calendar.DAY_OF_MONTH,-1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
		
	}
}
