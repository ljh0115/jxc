package DateDemo;
/**
 *	8�������������� ���߱��๦��
 * 	Java����Ϊ�˼�ǿ������������Ϊÿһ���������Ͷ��ṩ��һ����(��װ��)
 * 	��װ����Ҫ�ṩ���������������װ���String
 * 	�� int Integer StringΪ��
 */
public class TestMath {
	public static void main(String[] args) {
		//intת��ΪInteger
		int a=10;
		Integer it=new Integer(a);
		System.out.println(it.toString());
		
		//Integerת��Ϊint
		Integer it2=new Integer(20);
		int a2=it2.intValue();
		System.out.println(a2);
		
		//Stringת��ΪInteger
		String s="100";
		System.out.println(s+1);
		Integer it3=new Integer(a);
		System.out.println(it3+1);
		
		//Integerת��ΪString
		Integer it4=new Integer(30);
		String s2=it4.toString();
		System.out.println(s2);
		//intת��ΪString
		int a3=100;
		String s3=Integer.toString(a3);
		System.out.println(s3);
		//Stringת��Ϊint
		String s4="50";
		int a4 =Integer.parseInt(s4);
		System.out.println(a4);
		
		//doubleת��ΪString
		double s5=12.2;
		String a5=String.valueOf(s5);
		System.out.println(a5+1);
		//Stringת��λdouble
		String s6="32";
		double a6=Integer.parseInt(s6);
		System.out.println(a6);
	}
}
