import java.util.Scanner;
//�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
public class test21 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("�����������գ�");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=0;
		switch(b){
		case 12:d+=30;
		case 11:d+=31;
		case 10:d+=30;
		case 9:d+=31;
		case 8:d+=31;
		case 7:d+=30;
		case 6:d+=31;
		case 5:d+=30;
		case 4:d+=31;
		case 3:if(a%4==0&&a%100!=0&&a%400==0){
			d+=29;
		}else{d+=28;};
		case 2:d+=31;
		case 1:d+=c;
		default:System.out.println("�·ݴ���");
		}
		System.err.println(a+"��"+b+"��"+c+"���ǽ���ĵ�"+d+"��");
		
	}
}
