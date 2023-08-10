package com.byteapp;
import java.io.*;
public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fin=new FileInputStream("buginfo.dat");
		byte[] bt=new byte[20];
		fin.read(bt);
		for(byte b:bt) {
			System.out.print((char)b);
		}


	}
		catch(IOException e){
			System.out.print(e);}
		}

}
