package ioStream;
// Read Single Character 
import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) throws IOException{
		FileInputStream f=new FileInputStream("F:\\Hello.txt");
		System.out.println((char)f.read());
		f.close();
	}
}
