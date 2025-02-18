package com.basicproblems.readcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {

    //method to read data
    public void readData(String path){

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            //loop to read data line by line
            while ((line = br.readLine()) != null){

                String[] data = line.split(",");

                System.out.println("ID "+data[0]+"\nName"+data[1]+"\nAge "+data[2]+"\nMarks "+data[3]);


            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
