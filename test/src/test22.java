
public class test22 {
    public static void main(String [] args) {
     for(int i=1;i<=10;i++){
    	 //�������10����
        int number=(int)(Math.random()*3);
        switch(number){
            case 0:
            System.out.println("������һֻ�����Һ�����");
            break;  
            case 1:
            System.out.println("������һֻ�����Һ�ϲ��");
            break;
            case 2:
            System.out.println("������һֻ�������¾Ʋ���");
            break;
            default:
            break;
        }
    }
  }
}