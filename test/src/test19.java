import java.util.Scanner;
// ��������һ��5λ�����ж����ǲ��ǻ�����
public class test19 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("�����������:");
	int i=s.nextInt();
	
	int w=i/10000;
	int q=i/1000%10;
	int sh=i/10%10;
	int g=i%10;
	
		if(g==w&&q==sh){
			System.out.println("�ǻ�����");
		}else{
			System.out.println("���ǻ�����");
		}
	
	}
}
