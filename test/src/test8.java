 import java.util.Scanner;
public class test8 {
	public static void main(String[] args){
		//����Scanner����
		Scanner s=new Scanner(System.in);
		//��ʾ�û�����һ������
		System.out.println("������һ������");
		System.out.println("������һ������");
		//�����û����������  next() nextInt() nextDouble()
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b&a!=b){
			System.out.println(a+"����");		
		}
		if(b>a&a!=b){
			System.out.println(b+"����");	
		}
	}
}
