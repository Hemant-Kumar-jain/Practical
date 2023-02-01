package Control_Statement;
import java.util.Scanner;

public class While_DoWhile_test {
	public static void main(String[] args) {
		int sum=0;
		int num=0;
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		while(true) {
			num=sc.nextInt();
			if(num<0)break;
			sum+=num;
				}
		System.out.println("sum is:+"+sum);
		sc.close();*/
		
		Scanner sc=new Scanner(System.in);
		do {
			sum+=num;
			System.out.println("Enter the Number");
			num=sc.nextInt();
		}
		while(num>=0);
		System.out.println("sum is:" +sum);
		sc.close();
	}

}
