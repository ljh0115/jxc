import java.sql.SQLException;
import java.util.Scanner;


public class dlui {
	public static void DLUI() throws SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("�������˺ţ�");
		String username=s.next();
		System.out.println("���������룺");
		String pwd=s.next();
		shiti sh=new shiti();
		sh.setUsername(username);
		sh.setPwd(pwd);
		boolean bn=dl.Dl(sh);
		if(bn==true){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
	}
}
