package sklx;

import java.util.TreeSet;

/*
 	����TreeSet
 	���Զ�������ʽʵ�� �Դ���Ȼ����	
 	�Զ�����ഴ������ ��ŵ�TreeSet������
 	����TreeSet
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//����TreeSet����
		TreeSet<String> set=new TreeSet<String>();
		set.add("a");
		set.add("c");
		set.add("d");
		set.add("b");
		//����
		for (String s:set) {
			System.out.println(s);
		}
	}
}
