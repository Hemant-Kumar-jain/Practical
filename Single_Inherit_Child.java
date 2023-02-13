package hemant.com;

class Single_Inherit_Parent {
	int a,b;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Single_Inherit_Child extends Single_Inherit_Parent {
		void get(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public static void main(String[] args) {
			Single_Inherit_Child child=new Single_Inherit_Child();
			child.get(10,20);
			child.show();
		}
	}

