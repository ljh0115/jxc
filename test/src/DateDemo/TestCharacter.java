package DateDemo;
/**
 * 
 * @author LJH
 *	char��İ�װ��Character��
 *	�����ṩ��String�໥ת���ķ���֮��
 *	����һЩ�Ƚ�ʹ�õķ���
 *	isLetter(char a)�ж��Ƿ������ĸ
 *	isDigit��char a���ж��Ƿ��������
 */
public class TestCharacter {
	public static void main(String[] args) {
		//�ж��û����Ƿ������ĸ
		String name= "41651frs";
		//ת��Ϊchar��������
		char[] arr=name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])){
			System.out.println("��������");
			break;
			}
		}
	}
}
