
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class lx6test {
	public static void main(String[] args) {
		lx5 a1=new lx5();
		a1.name="����";
		a1.className="java1��";
		a1.a=88.0;
		lx5 a2=new lx5();
		a2.name="����";
		a2.className="java2��";
		a2.a=60.5;
		lx5 a3=new lx5();
		a3.name="����";
		a3.className="java3��";
		a3.a=95.0;
		ArrayList<Serializable> list=new ArrayList<Serializable>();
		list.add(a1.toString());
		list.add(a2.toString());
		list.add(a3.toString());
		//��һ�� ����list�����ص�
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
			}
		System.out.println("************");
		//�ڶ��� �ü�ǿforѭ��	for(Ԫ������ ������:����������){}
		for (Object o:list) {
				System.out.println(o);
			}
		System.out.println("************");
		//������
		Iterator<Serializable> it= list.iterator();
		while(it.hasNext()){//�жϵ��������Ƿ���Ԫ�ؿ��Ե���
			//��ȡԪ��
			System.out.println(it.next());
		}
	}
}
