package DateDemo;

import java.util.Date;
	/*����ʱ���� ��ʾ�ص�˲�� 
	��������
	1.new Dtae()
	2.new Dtae(long time)
	������
	1.getTime()��ȡһ��ָ�����ڶ�Ӧ�ĺ���ֵʱ��
	*/
	public class TestDate {
	public static void main(String[] args) {
		//����Data����
		Date date=new Date();
		System.out.println(date);
		//��ȡ��ǰϵͳʱ���Ӧ�ĺ���ֵʱ��
		long time=date.getTime();
		System.out.println(time);
		//����Data���� ���вι�����
		Date date2=new Date(1538288756072L);
		System.out.println(date2);
	}
}
