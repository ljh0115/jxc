package sklx;

import java.util.ArrayList;
import java.util.Iterator;

public class lx2 {
	public static void main(String[] args) {
		//����List����
		ArrayList<String>  list=new ArrayList<String>();
		//���Ԫ��
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		//��һ�� ����list�����ص�
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println( );
		//�ڶ��� �ü�ǿforѭ��	for(Ԫ������ ������:����������){}
		for (Object o:list) {
			System.out.println(o);
		}
		System.out.println( );
		//������ �õ�����
		Iterator<String> it=list.iterator();
		while(it.hasNext()){//�жϵ��������Ƿ���Ԫ�ؿ��Ե���
			//��ȡԪ��
			System.out.println(it.next());
		}
	}
}
