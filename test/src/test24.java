import java.util.Scanner;

public class test24 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("����һ����");
		int a=0;//�����ĸ���
		int b=0;//�����ĸ���
		for(;;){
			int sum=s.nextInt();
			if(sum>0){
			a++;
			}else if(sum<0){
				b++;
			}else{
				break;
			}
			}
		System.out.println("�����ĸ���Ϊ��"+a);
		System.out.println("�����ĸ���Ϊ��"+b);
	}
}
