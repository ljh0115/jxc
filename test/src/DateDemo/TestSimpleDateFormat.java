package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ڸ�ʽ����
 * ��Date�����ʽ��Ϊһ��String����ʱ��
 * format()
 * ��String����ʱ�����ΪDate����
 * parse()
 * ע�⣺���������ַ���ʱ�� ��ʽ��Ҫһ��
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		//����Data����
		Date d=new Date();
		System.out.println(d);
		//������ʽ��	Ĭ�Ϸ��
		SimpleDateFormat sdf=new SimpleDateFormat();
		String s=sdf.format(d);
		System.out.println(s);
		//������ʽ��	ָ�����
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s2=sdf2.format(d);
		System.out.println(s2);
		//
		String s3="2018-9-30";
		//������
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		Date d2=sdf3.parse(s3);
		System.out.println(d2);
	}
}
