package Demo4;
/*
 * @author Administrator
 *	���һ����״��(�ӿ�)Shape,����:���ܳ�������� ��״��(�ӿ�)������(ʵ����):
 *	Rect(����),Circle(Բ��)  Rect�������:Square(������) 
 *	��ͬ��������в�ͬ�ļ����ܳ�������ķ��� 
 *	����������ͬ����״����,����Shape���͵�������,�ֱ��ӡ��ÿ��������ܳ������
 */
public class TestShape {
	public static void main(String[] args) {
		//�������ζ���
		Rect r=new Rect();
		r.setLength(4);
		r.setWidth(2);
		//����Բ�ζ���
		Circle c=new Circle();
		c.setR(1);
		//���������ζ���
		Square s=new Square();
		s.setSide(4);
		
		//����һ���Զ�����������
		Shape[] arr={r,c,s};
		//ָ����������ΪShape ��ô������ֻ�ܴ�Shape�������ݻ��Shape�༶��͵�����
		
		//�������� ��ֱ�õ�����ͼ�εĶ�����
		for (int i = 0; i < arr.length; i++) {
			//ͨ���������������ǵ�������ܳ�����
			arr[i].area();
			arr[i].girth();
		}
	}
}
//ͼ�����ܸ��� ��Ϊ�ӿ�
interface Shape{
	void area();//�������
	void girth();//�ܳ�����
}
//ʵ����  ����  ����ӿ�֮����ʵ�ֹ�ϵ �÷����Ƽ̳�
class Rect implements Shape{
	//��չ����
	private int length;//��
	private int width;//��
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//��д����
	@Override
	public void area() {
		System.out.println("�������:"+length*width);
	}
	@Override
	public void girth() {
		System.out.println("�����ܳ���"+2*(length+width));
	}
}
//ʵ����  Բ��
class Circle implements Shape{
	//��չ����
	private double r;//�뾶
	final double PI=3.14;//Բ����
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	//��д����
	@Override
	public void area() {
		System.out.println("Բ�������"+PI*r*r);
	}
	@Override
	public void girth() {
		System.out.println("Բ���ܳ���"+2*PI*r);
	}
}
//������ ���� ������  ������֮���Ǽ̳�
class Square extends Rect{
	//��չ����
	private int side;//�߳�
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	//��д����
	@Override
	public void area() {
		System.out.println("�����������"+side*side);
	}
	@Override
	public void girth() {
		System.out.println("�������ܳ���"+4*side);
	}
}