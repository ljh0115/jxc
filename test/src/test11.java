 import java.util.Scanner;
public class test11 {
	public static void main(String[] args){
	//����Scanner����
	Scanner s=new Scanner(System.in);
	//�������
	System.out.println("���(cm)��");
	int height=s.nextInt();
	//������
	System.out.println("���(��)��");
	double money=s.nextDouble();
	//�����Ƿ�
	System.out.println("˧��(true/false)��");
	boolean bn=s.nextBoolean();
	//�ж����������Ƿ�ȫ����
	if(height>180&&money>1000&&bn==true){
		//���������
		System.out.println("��һ��Ҫ�޸���!!!");
	}
	//�ж����������Ƿ�������һ������
	else if(height>180||money>1000||bn==true){
		//���������
		System.out.println("�ް�,���ϲ���,��������.");
	}
	//�ж����������Ƿ�ȫ������
	else if(height<=180&&money<=1000&&bn==false){
		//�����������
		System.out.println("����!");
	}
	}
}
