package com.byteapp;
import java.io.*;

public class Bytedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs=new FileOutputStream("c://myiofiles//myfile.txt");
			String str="Hello World";
			byte[] bt=str.getBytes();
			fs.write(bt);
			fs.flush();
			fs.close();
		}
		catch(IOException ex){
			System.out.println(ex);
		}

	}

}
