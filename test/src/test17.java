import java.util.Scanner;

//�ж�һ�����Ƿ�������
public class test17 {
	public static void main(String[] args) {
		//��������һ����
		Scanner s=new Scanner(System.in);
		System.out.println("����һ������");
		int a=s.nextInt();
		//�������� ͳ��Լ���ĸ���
		int c=0;
		//��ѭ���ҵ�1��������֮�����е�����
		for(int i=1;i<=a;i++){
			//�ж����������ȡģ1��������֮�����е�����
			if(a%i==0){
				c++;//��¼��������
			}
		}
		if(c==2){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
}
