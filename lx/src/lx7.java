import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 ʹ��Scanner�ӿ���̨��ȡһ���ַ�����ͳ���ַ�����ĳ���ַ����ֵĴ�����Ҫ��ʹ��ѧϰ����֪ʶ�������Ҫ�� 
ʵ��˼·����Map���ϵ�������ɡ�
Scanner src=new Scanner(System.in);
Src.nextLine();//��ȡһ��

 */
public class lx7 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("�����룺");
		String s=src.nextLine();//��ȡһ��
		//abcdea
		//���赥���ַ���Ϊ��
		//���ִ�����Ϊֵ
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		//���ַ���ת��Ϊchar��������
		char[] arr=s.toCharArray();
		for (char c : arr) {
			//�ж�map�������Ƿ����ָ���ַ�����Ϊ��
			if(map.containsKey(c)){
				Object o=map.get(c);//���ݼ���ȡֵ
				map.put(c, (Integer)o+1);
			}else{
				map.put(c, 1);
			}
		}
		//����
		Set<Character> set=map.keySet();
		for (Object c : set) {
			System.out.println(c+"�����ˣ�"+map.get(c)+"��");
		}
	}
}
