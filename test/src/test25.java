import java.util.Scanner;

public class test25 {
	public static void main(String[] args){
		float sum=0;
		float i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("���ѧ���ĳɼ���");
		for(int a=1;a<=5;a++){	
			float b=s.nextFloat();
			sum+=b;
		}
		i=sum/5;
		System.out.println("�ܷ֣�"+sum+"ƽ���֣�"+i);
	}
}
