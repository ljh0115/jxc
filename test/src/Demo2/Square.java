package Demo2;
//������
public class Square extends Rect{
	private double b;
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	public void zc(){
		System.out.println("�������ܳ�Ϊ��"+4*b);
	}
	@Override
	public void mj(){
		System.out.println("���������Ϊ��"+b*b);
	}
}

