package com.byteapp;
import java.io.*;

public class Writetoconsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintStream pout=System.out;
			pout.write(buginfo.dat);
			
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
