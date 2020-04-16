import java.util.ArrayList;
import java.util.Collections;
/*
 	����һ��Employee��,
 ����:name:String,age:int,salary:double 
������Employee�������List��,
���򲢱������,�������:salary�͵���ǰ��,
salary��ͬʱageС����ǰ��,
ageҲ��ͬʱ����name��������
 */
public class lx6 {
	public static void main(String[] args) {
		//����List����
		ArrayList<Employee> list=new ArrayList<Employee>();
		//���Ԫ��
		list.add(new Employee("����",25,6000));
		list.add(new Employee("����",25,6000));
		list.add(new Employee("����",19,6000));
		list.add(new Employee("�ֶ�",25,5500));
		//��List�������������
		Collections.sort(list);
		//����
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//������
	public Employee() {
	}
	public Employee(String name, int age, double salary){
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//��д����
	@Override
	public String toString() {
		return name+"---"+age+"---"+salary;
	}
	@Override
	public int compareTo(Employee o) {//�ƶ�����
		//��������  ������� ������������  ������� ��������
		if(this.salary!=o.salary){
			return (int)(this.salary-o.salary);
		}
		if(this.age!=o.age){
			return this.age-o.age;
		}
		return this.name.compareTo(o.name);
	}
}