/*
 * 	�з���ֵ �в����ķ���
 * 	
 */
public class ff4 {
	public static int max(int[] arr){
	int max=arr[0];
	//�������� �ҳ�����Ԫ��
	for (int i = 0; i < arr.length; i++) {
		if(max<arr[i]){
			max=arr[i];
		}
	}
	return max;
	}
}
