package Control_Statement;

public class KitePattern {
	public static void main(String args[]){

		for(int i=1;i<=4;i++){
		for(int j=1;j<=2*(3-i+1);j++){
		System.out.print(" ");
		}
		for(int j=1;j<=2*(i*3-(i+1))-1; j++){
		System.out.print("*");
		}
		System.out.println();
		}

		for(int i=1;i<=6;i++){
		for(int j=1;j<=i;j++){
		System.out.print(" ");
		}
		for(int j=1;j<=2*(6-i+1)-1;j++){
		System.out.print("*");
		}
		System.out.println();
		}

		for(int i=1;i<=3;i++)
		{
		for(int j=1;j<=6-i+1;j++){
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
		}}
