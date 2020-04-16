package sklx;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

/*
 	����Map����
 		Map���ϵ��ص㣺
 					1.map���Լ�ֵ�Ե���ʽ�洢����
 					2.��Ҫ��֤����Ψһ�� ����ʹ��String��������
 					3.һ�������ӳ��һ��ֵ
 					4.����null��nullֵ
 					5.���Ԫ�� ���ظ� ֵ����
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//����Map����
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		//���Ԫ��
		h.put(1,"����");
		h.put(2,"����");
		h.put(3,"����");
		h.put(4,"��һ");
		//ɾ��Ԫ��
		h.remove(4);
		//��ѯ�Ƿ����Ԫ��
		System.out.println(h.containsKey(4));
		//Ԫ�ظ���
		System.out.println(h.size());
		//����
		//��һ�� ����KeySet() ����һ��Set����
		Set<Integer> set=h.keySet();
		//����Set����
		for (Integer it : set) {
			String v=h.get(it);
			System.out.println(it+"\t"+v);
		}
		System.out.println("************");
		//�ڶ��� ʹ�õ�Map���ϵ��ڲ���Entry Map���ϵ�ÿ����ֵ�Թ�ϵ�����Ӧһ��Entry����
		Set<Entry<Integer,String>>set1=h.entrySet();
		//����
		for (Entry<Integer, String> e : set1) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
}
