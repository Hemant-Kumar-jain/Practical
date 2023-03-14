package string;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void my() {
		StringTokenizer st=new StringTokenizer("I am Hemant Jain,And I am From Faridabad.");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}
		StringTokenizer s=new StringTokenizer("I am Self Motivated");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken(" "));
		}
	}
	public static void main(String[] args) {
		my();
	}
}
