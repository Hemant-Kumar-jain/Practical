package ioStream;

import java.io.*;
public class WriteByteFOS {
	public static void main(String[] args)  throws IOException{
			FileOutputStream f=new FileOutputStream("F:\\4119.txt");
//			String s="Welcome to the Anudip Foundation\nYou are choose our IT training program\nThank you";
//			byte b[]=s.getBytes();
			f.write(65);// it used for converting the byte into string
			f.close();
			System.out.println("Done");
		} 
	}

