//��С��������
//ð���������ڵ�����Ԫ�ؽ��бȽ� ����������Խ���
//ÿ��ѭ���õ�һ�����ֵ��������� ��һ��ѭ��������ͬԭ����������
//�Ƚ����������鳤��-1	ÿ�˱Ƚϴ��������鳤��-�Ƚ�����
//import java.util.Arrays;
public class sz4 {
	public static void main(String[] args) {
		int []arr={90,34,-23,18,12};
		//ð��ѭ��
		for(int i=0;i<arr.length-1;i++){//�Ƚ�����
			for(int j=0;j<arr.length-i-1;j++){//ÿ�˱Ƚϴ���
				//�Ƚ��������ڵ�Ԫ��
				if(arr[j]>arr[j+1]){
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}	
		}
		//�������� Ĭ��������
		//Arrays.sort(arr);
		//��������������
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
