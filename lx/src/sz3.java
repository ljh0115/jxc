//�������е������Сֵ
public class sz3 {
	public static void main(String[] args){
		//��������
		int arr[]={90,34,-23,18,12};
		//�������� ������ֵ �����һ��Ԫ�������ֵ
		int max=arr[0];
		//�������� �����Сֵ �����һ��Ԫ������Сֵ
		int min=arr[0];
		//�������� ��ȡ�����е�����Ԫ��
	for(int i=0;i<arr.length;i++){
		//������ֵ
		if(arr[i]>max){
			max=arr[i];
		}
		//�����Сֵ
		if(arr[i]<min){
			min=arr[i];
		}
	}
	System.out.println("�����е����ֵ"+max);
	System.out.println("�����е���Сֵ"+min);
	}
}
