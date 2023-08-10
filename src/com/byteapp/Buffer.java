package com.byteapp;
import java.io.*;

public class Buffer {
	public static void main(String[] args)
	{
		   try {
	            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
	            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

	            String data = "Developer Name:peter Bug No:45\nBud Description:new bug found";
	            byte[] bytes = data.getBytes();
	            bufferedOutputStream.write(bytes);

	            bufferedOutputStream.close();
	        } catch (IOException e) {
	            
	        }

	       
	        try {
	            FileInputStream fileInputStream = new FileInputStream("data.txt");
	            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

	            byte[] buffer = new byte[1024];
	            int bytesRead = bufferedInputStream.read(buffer);
	            String readData = new String(buffer, 0, bytesRead);
	            System.out.println(readData);

	            bufferedInputStream.close();
	        } catch (IOException e) {

	        }
	    }

}
