import java.util.Scanner;
//ѭ���������0�����ֽ����ۼӣ�ֱ�����������Ϊ0���ͽ���ѭ�������������ۼӵĽ����
public class test23 {
	public static void main(String [] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		for(;;){
		int a=sc.nextInt();
			sum=sum+a;
		if(a==0){
			System.out.println("�ۼӵĽ��Ϊ��"+sum);
			
		}
		}
	}	
}
