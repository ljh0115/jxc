package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 
 * @author LJH
 *	����ི������
 *		�����ڴ洢 ���� ������ɾ�����ݵļ���
 * 		���ϵ��ص㣺
 * 				1.���ϵĳ����ǿɱ��
 * 				2.���ϴ洢����������������
 * 				3.�����в��ܳ��ֻ�����������ֵ
 * 		���÷�����
 * 			��ӣ�add()��ӵ���Ԫ��
 * 				addAll(Collection c)�������Ԫ��
 * 			��ȡ��size()
 * 			ɾ����remove()
 * 				removeAll()
 * 			������contains()
 * 			
 */
public class TestCollection {
	public static void main(String[] args) {
		//��������
		Collection<String> c=new ArrayList<String>();
		//���Ԫ��
		c.add("10");//new Integer(10)�Զ�װ��
		c.add("����");
		c.add("����");
		//��ȡ���ϳ���
		int a=c.size();
		//ɾ��Ԫ��
		c.remove("����");
		//�жϼ������Ƿ����ĳ��Ԫ��
		boolean bn1=c.contains(10);
		System.out.println(bn1);
		//�жϼ������Ƿ���Ԫ��
		boolean bn2=c.isEmpty();
		System.out.println(bn2);
		System.out.println(c);
		System.out.println(a);
	}
}
