package Demo2;

public class Student {
	static{
		System.out.println("��̬�����");
	}
	//ʵ������
	String name;
	char sex;//�Ա�
	int age;
	//�����
	static String className="����2��";
	static double classMoney=1000;//���
	public void spend(double money){
		System.out.println("ԭ�а��"+classMoney);//�෽��
		classMoney=classMoney-money;
		System.out.println(name+"����"+money+"��ʣ"+classMoney);
	}
	//������
	public Student(){
		
	}
	public Student(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

}