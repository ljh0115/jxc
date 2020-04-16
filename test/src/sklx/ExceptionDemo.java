package sklx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	����ི���쳣��
 		���
 			�ǳ����ڱ����ڻ������ڳ��ֵ�����
 			���������Щ���Ա��� ��Щ�޷�����
 		���ࣺ
 			�������쳣 ��RuntimeException�������� �쳣����ͨ�������߼�˼ά���� ����Ҫ����
 				������
 					�����쳣�� ArrayIndexOutOfBoundsException
 					�����쳣��
 					����ת���쳣��
 					��ָ���쳣��
 			�������쳣 ����Exception�������� ����RuntimeException
 			���ɱ��� ���봦�� Java�����ṩ����������
 			1.�׳��쳣
 					throws �쳣����
 			2.�����쳣
 					try{���ܳ����쳣�Ĵ����
 					}catch(�쳣���� �쳣��){�����쳣�� �����쳣�Ĵ���
 					}finally{�����Ƿ񲶻��쳣 �������еĴ����
 					}
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		/*�����±�Խ���쳣
		 int[] arr=new int[10];
		 System.out.println(arr[10]);
		
		�����쳣
		 int a=10;
		 System.out.println(a/0);
		����ת���쳣
		 Object o=new Integer(10);
			String s=(String)o;
			System.out.println(s);
		��ָ��
		 String s=null;
		 System.out.println(s.toString());
		 */
		try {
			String s="2018.10.9";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date d=sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
//			System.out.println("ץ���쳣��");
		}finally{
			 System.out.println("�����Ƿ񲶻��쳣 ����ִ�д����");	
		}
		
		System.out.println(666);
	}
}
