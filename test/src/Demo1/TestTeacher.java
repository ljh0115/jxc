package Demo1;


public class TestTeacher {

	public static void main(String[] args) {
		//�����޲�����������������
		Teacher t=new Teacher();
		t.name="����ʦ";
		t.age=30;
		t.speak();
		
		//�����вι�������������
		Teacher t2=new Teacher("�϶�",18);
		t2.speak();
	}
}
