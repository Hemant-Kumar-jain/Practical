package ioStream;
import java.io.*;
public class FileInputStreamEx2 {
	public static void main(String[] args) throws IOException{
		FileInputStream f=new FileInputStream("F:\\Hello.txt");
		int i=0;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println((char)i);
		f.close();
	}
}
