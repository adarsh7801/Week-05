package com.intermediateproblems.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecord {

    public void filterRecord(String path) {

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;

            line = br.readLine();

            while((line = br.readLine()) != null){

                String[] data = line.split(",");

                double a = Double.parseDouble(data[3]);

                if(a>80){
                    System.out.println("ID: "+data[0]+"\nName: "+data[1]+"\nAge: "+data[2]+"\nMarks: "+data[3]);
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
