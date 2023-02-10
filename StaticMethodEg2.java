package hemant.com;

class StaticMethodEg{
	static int add(int a,int b) {
		return a+b;
	}
}
public class StaticMethodEg2 {
	public static void main(String[] args) {
		int c=StaticMethodEg.add(10, 12);
		System.out.println(c);
	}
}
