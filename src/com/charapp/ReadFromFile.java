package com.charapp;

import java.io.*;
public class ReadFromFile {
    public static void main(String[] args) {
    	   try {
               FileReader reader = new FileReader("save.txt");

               int character;
               while ((character = reader.read()) != -1) {
                   System.out.print((char) character);
               }

               reader.close();
           } catch (IOException e) {
               
           }
       }
   }
