package sklx;

import java.util.HashSet;
import java.util.Iterator;

/*
 	����Set���ϣ�
 			HashSet���Թ�ϣ�����ʽʵ����Set
 	Set���ϵ��ص㣺
 			1.����� ��ָ��Ӻͻ�ȡԪ�ص�˳��һ��
 			2.������Ԫ���ظ�
 			3.���洢һ��null
 	���ͣ�
 			����һ��ָ������֮�� ֻ�ܴ洢ָ���������� ��߰�ȫ��
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//����Set����
		HashSet<Integer> set=new HashSet<Integer>();
		//���Ԫ��
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		@SuppressWarnings("unused")
		int[] arr={10,20,30,40};
		//��������
	for(Integer o:set){
		System.out.println(o);
	}
	System.out.println("**********");
	Iterator<Integer> it= set.iterator();
	while(it.hasNext()){//�жϵ��������Ƿ���Ԫ�ؿ��Ե���
		//��ȡԪ��
		System.out.println(it.next());
	}
	}
}
