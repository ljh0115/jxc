package Demo4;
/*
 * 
 * @author Administrator
 *	ĳ��˾�Ĺ�Ա��Ϊ���������ࣺ
Employee����������Ա���ܵĸ��࣬����Ϊ������ ���ԣ�Ա��������,Ա���������·ݡ��ṩ���󷽷���getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100Ԫ��
SalariedEmployee��Employee�����࣬�ù̶����ʵ�Ա�������ԣ���н
SalesEmployee��Employee�����࣬������Ա�������������۶������ʾ��������ԣ������۶�����
 */
public class TestEmployee {
	public static void main(String[] args) {
		//�����ù̶�����Ա������
		SalariedEmployee se=new SalariedEmployee();
		se.setName("����");//����
		se.setBirthday(5);//�����·�
		se.setSalary(3000);//��н
		se.getSalary(5);//����5�·ݹ���
		
		//����������Ա����
		SalesEmployee sa=new SalesEmployee();
		sa.setName("����");//����
		sa.setBirthday(5);//�����·�
		sa.setSale(100000);//���۶�
		sa.setTcSale(0.2);//�����
		sa.getSalary(5);//����5�·ݹ���
	}
}
//Ա������ܸ��� �ǳ����� ������ ���� �����·� �����㹤�ʷ��� 
abstract class Employee{
	//����
	private String name;//����
	private int birthday;//�����·�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	//��Ϊ ��ȷ������ ����û�о�����㷽ʽ ���󷽷����
	public abstract void getSalary(int month);
}
//�ù̶����� ���� 
class SalariedEmployee extends Employee{
	//��Ҫ������н û�м̳е� ��չ������н
	private double salary;//��н
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//��д���㹤�ʷ���
	@Override
	public void getSalary(int month) {
		//�ж��Ƿ������
		if(month==getBirthday()){
			System.out.println(getName()+month+"�¹��ʣ�"+(salary+100));
		}else{
			System.out.println(getName()+month+"�¹��ʣ�"+salary);
		}
	}
}
//������Ա ����
class SalesEmployee extends Employee{
	//��Ҫ�������۶� ������� û�м̳е� ��Ҫ��չ
	private double sale;//���۶�
	private double tcSale;//�����
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public double getTcSale() {
		return tcSale;
	}
	public void setTcSale(double tcSale) {
		this.tcSale = tcSale;
	}
	//��д���㹤�ʷ���
	@Override
	public void getSalary(int month) {
		//�ж��Ƿ������
		if(month==getBirthday()){
			System.out.println(getName()+month+"�¹��ʣ�"+(sale*tcSale+100));
		}else{
			System.out.println(getName()+month+"�¹��ʣ�"+sale*tcSale);
		}	
	}
}