package Demo2;
//������  ����������ܳ���Ҫ���� ����û�м̳����� ������Ҫ������չ����  ��Ҫ��д
public class Rect extends Shape{
	private double c;//��
	private double k;//��
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getK() {                                                                           
		return k;
	}
	public void setK(double k) {
		this.k = k;
	}
	@Override
	public void zc(){
	System.out.println("�����ܳ�Ϊ��"+2*(c+k));
	}
	@Override
	public void mj(){
	System.out.println("�������Ϊ��"+c*k);
	}
}
