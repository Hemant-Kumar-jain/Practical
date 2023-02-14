package hemant.com;
import java.util.*;

class Vehicle{
	int speed;
	void show() {
		if(speed<80) {
		System.out.println("You can safe with that Speed");
		}
		else {
			System.out.println("You can not safe with that Speed");
		}
	}
}
class Bike extends Vehicle{
	void get(int x) {
		this.speed=x;
	}
}
class Car extends Vehicle{
	void get(int x) {
		this.speed=x;
	}
}
public class Hierarchy_Inheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bike Speed");
		int a=sc.nextInt();
		System.out.println("Enter the Car Speed");
		int b=sc.nextInt();
		Bike bike=new Bike();
		bike.get(a);
		bike.show();
		Car car=new Car();
		car.get(b);
		car.show();
		
	}
}
