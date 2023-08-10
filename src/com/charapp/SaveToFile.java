package com.charapp;

import java.io.*;

public class SaveToFile {
    public static void main(String[] args) {
        String data = "Employee Name: Peter Sam Joes\nDepartment:Sales\nDesignation:Manager\nSalary :35000";

        try {
            FileWriter writer = new FileWriter("save.txt");
            writer.write(data);
            writer.close();
            
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}