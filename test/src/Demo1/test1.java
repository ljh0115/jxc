package Demo1;

public class test1 {
	public static void main(String[] args) {
		//����ʳ�����
		Fish f=new Fish();
		f.fishName="������";
		
		//�����������
		Cat a=new Cat();
		a.catName="��ķè";
		
		//��������Ա����
		Feeder fe=new Feeder();
		fe.feederName="����";
		
		//����ָ��
		fe.feed(a);
		a.eat(f);
	}
}
