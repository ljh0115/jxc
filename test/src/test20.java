import java.util.Scanner;
//�����������������뵽a��b������ȥ�����a>=b�ͽ�a��b�е�ֵ���н�����
//����Ͳ�������Ŀ�ؾ���Ҫ��a�зŵ�ֵ����С�ڻ����b�е������������a��b��ֵ
public class test20 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("������������:");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>=b){
		int c=b;
		b=a;
		a=c;
		}
		System.out.println(a);
	}	
}
