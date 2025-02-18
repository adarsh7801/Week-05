package com.basicproblems.countrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {

    // Method to read data
    public void readData(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            int rowCount = 0;

            line = br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 4) {

                    System.out.println("ID: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Age: " + data[2]);
                    System.out.println("Marks: " + data[3]);
                } else {
                    System.out.println("Invalid data format: " + line);
                }

                rowCount++;
            }

            System.out.println("Row count is: " + rowCount);
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
