package hemant.com;

class Parent{
	int a,b;
	void show() {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
class Child1 extends Parent{
	void display() {
		System.out.println(a+" * "+b+" = "+a*b);
	}
}

class Child2 extends Child1{
	void get(int a,int b) {
		this.a=a;
		this.b=b;
	}	
}

public class MultiLevel_inheritance {
	public static void main(String[] args) {
		Child2 child2=new Child2();
		child2.get(10,20);
		child2.show();
		child2.display();
	}

}
