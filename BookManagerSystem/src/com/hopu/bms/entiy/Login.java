package com.hopu.bms.entiy;
//ʵ����
public class Login {
		//����
		private String userName;//�˺�
		private String pwd;//����
		
		//��Ϊ
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public Login() {
			// TODO Auto-generated constructor stub
		}
		public Login(String userName, String pwd) {
			super();
			this.userName = userName;
			this.pwd = pwd;
		}
}
