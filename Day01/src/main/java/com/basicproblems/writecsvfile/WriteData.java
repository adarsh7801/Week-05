package com.basicproblems.writecsvfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

    static String data[];
    public void writeData(String path){

        try (BufferedWriter Writer = new BufferedWriter(new FileWriter(path))){


            Writer.append("ID,Name,Age,Marks \n");
            for(int i=0;i<data.length;i++){
                Writer.append(data[i]);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void dataInput(String data[]){
        this.data = data;
    }
}
