package Demo2;
//final �ؼ��� ���յĲ����޸ĵ�	final���εı��� ���Կ�������	������д	���ܱ��̳�
public class Circle extends Shape{
	private double r;
	final double PI=3.14;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public void zc(){
		System.out.println("Բ�ܳ�Ϊ��"+2*PI*r);
	}
	@Override
	public void mj(){
		System.out.println("Բ���Ϊ��"+PI*r*r);
	}
}
