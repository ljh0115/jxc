
public class test3 {
	public static void main(String[] args){
		//���������洢��һ����λ����
		int a=8723;
		//���������洢ǧλ
		int q=a/1000;
		//���������洢��λ
		int b=(a%1000)/100;
		//���������洢ʮλ
		int s=(a%100)/10;
		//���������洢��λ
		int g=a%10;
		//��ӡ����λ����ǧλ ��λ ʮλ ��λ
		System.out.println(a+"��ǧλ��"+q+"��λ��"+b+"ʮλ��"+s+"��λ��"+g);
	}
}
