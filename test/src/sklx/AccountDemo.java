package sklx;

/*
  �Զ����쳣
*/
public class AccountDemo {
	public static void main(String[] args){
		Account a=new Account();
		a.setName("����");
		a.setBalance(-1000);
		System.out.println(a.getName()+"����"+a.getBalance());
	}
}
	class Account{
		private String name;
		private double balance;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			if(balance<0){
				//�׳��Զ����쳣
				try {
					throw new Exception();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			this.balance = balance;
		}	
	}
	//�Զ����쳣 
	class BalanceLT0Account extends RuntimeException{
		private static final long serialVersionUID = -7055604782454481445L;

		public  BalanceLT0Account() {
			super("�����쳣");
		}
	}

