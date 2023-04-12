package collections;
import java.util.*;
public class StoreEvenUsing_ArrayList {
	ArrayList<Integer> A1= new ArrayList<Integer>();
	public ArrayList<Integer> storeEvenNumbers(int N) {
		A1= new ArrayList<Integer>();
		for (int i=2;i<=N;i++) {
			if (i%2==0) { 
				A1.add(i);
			}
			}
		return A1;
		}
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		System.out.println("The Even Numbers are: ");
		for (int num:A1) {
			System.out.print(num+" ");
			A2.add(num*2);
			}
		System.out.println();
		System.out.println("After multiply by 2: ");
		for(int num1:A1) {
			System.out.print(num1*2+" ");
		}
		System.out.println();
		return A2;
		}
	public int retrieveEvenNumber(int N) {
		if(A1.contains(A1)) {
			return N;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		StoreEvenUsing_ArrayList sea = new StoreEvenUsing_ArrayList();
		sea.storeEvenNumbers(a);
		sea.printEvenNumbers();
		System.out.println("Retrieve Number is: "+sea.retrieveEvenNumber(5));
		}
	}

