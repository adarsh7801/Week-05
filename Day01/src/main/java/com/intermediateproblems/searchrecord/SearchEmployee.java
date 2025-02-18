package com.intermediateproblems.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployee {

    public void searchEmployee(String name){

        String path = "C:\\Users\\Adarsh Gupta\\Desktop\\Capgemini\\Week-05\\Day01\\src\\main\\java\\com\\intermediateproblems\\searchrecord\\employees.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;

            while((line = br.readLine()) != null){

                String[] data = line.split(",");

                if(data[1].equalsIgnoreCase(name)){
                    System.out.println("ID: "+data[0]+"\nName: "+data[1]+"\nAge: "+data[2]+"\nMarks: "+data[3]);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}