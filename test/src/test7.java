 import java.util.Scanner;
public class test7 {
	public static void main(String[] args){
		//����Scanner����
		Scanner s=new Scanner(System.in);
		//��ʾ�û�����һ������
		System.out.println("������һ������");
		//�����û����������  next() nextInt() nextDouble()
		int a=s.nextInt();
		//String b=a>=60?"����":"������";
		//System.out.println(b);
		if(60<=a&a<=100){
			System.out.println("����");		
		}
		if(0<=a&a<60){
			System.out.println("������");	
		}
	}
}
