package Demo1;

public class Account {
	//����
	long id;
	int password;//����
	String name;
	long personId;//���֤����
	String email;
	double balance;//���
	double money;//��ȡ�Ľ��
	//��Ϊ
	public void deposit(){//����
		balance=balance+money;
	}
	public void withdraw(){//ȡ���
		balance=balance-money;
	}
	//�޲ι�����
	public Account(){

	}
	//�вι�����
	public Account(int password,double balance,double money){
		this.password=password;
		this.balance=balance;
		this.money=money;
		
	}
}

