
public class overload {
	public void over(){
		System.out.println("����1");
	}
	public void over(double a){
		System.out.println("����2");
	}
	public void over(int a){
		System.out.println("����3");
	}
	public void over(int a,double b){
		System.out.println("����4");
	}
	public static void main(String[] args) {
		overload aa=new overload();
		aa.over(10);
	}
}
