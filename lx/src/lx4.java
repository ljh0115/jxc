//����
public class lx4 {
    public static void main(String[] args) {
        //ǰ���е�������
    	//��������
        for(int i=1;i<=5;i++) {
            //���ƿո�
            for(int k=5-i;k>=0;k--) {
                System.out.print(" ");
            }
            //����ÿ�е�*
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
        System.out.println();
        }
        //�����е�������
        //��������
        for(int i=4;i>=1;i--) {
            //���ƿո�
        	for(int k=5-i;k>=0;k--) {
                System.out.print(" ");
            }
        	//����ÿ�е�*
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
            //��ӡͼ��
        System.out.println();
        }
    }
}
