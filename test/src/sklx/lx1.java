package sklx;

import java.util.ArrayList;

/**
 * ����List����
 * 		List�����ص㣺
 * 					1.����
 * 					2.����Ԫ���ظ�
 * 					3.���Դ洢���nullԪ��
 * 		List������������ܣ�
 * 					Collection.
 */
public class lx1 {
	public static void main(String[] args) {
		//����List����
		ArrayList<String> list=new ArrayList<String>();
		//���Ԫ��
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		//�ڼ��ϵ�ָ��λ�����Ԫ��
		list.add(0,"������");
		//ɾ��ָ��Ԫ��
		list.remove("����");
		//list.remove(3);
		//�޸�Ԫ��
		list.set(0, "����");
		//��ȡ�б���Ԫ�صĸ���
		list.size();
		//��ȡָ��λ�õ�Ԫ��
		Object o=list.get(0);
		System.out.println(o);
		System.out.println(list);
	}
}
