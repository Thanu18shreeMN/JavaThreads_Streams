package com.byteapp;

import java.io.*;

public class Filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		InputStream in=System.in;
		try {
			
			byte[] bt=new byte[40];
			System.out.println("enter name:");
			in.read(bt);
			
			FileOutputStream fs=new FileOutputStream("buginfo.dat");
			String str=new String(bt);
			byte[] b=str.getBytes();
			fs.write(b);
			fs.flush();
			fs.close();
			 
		}
		catch(IOException ex){
			System.out.println(ex);
		}

	}

}