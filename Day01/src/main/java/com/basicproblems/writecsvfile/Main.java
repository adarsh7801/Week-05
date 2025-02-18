package com.basicproblems.writecsvfile;

public class Main {

    public static void main(String[] args) {

        WriteData wd = new WriteData();
        String data[] = {"1,Adarsh,20,90\n","1,Adarsh,20,90\n","1,Adarsh,20,90\n"};
        wd.dataInput(data);
        wd.writeData( "C:\\Users\\Adarsh Gupta\\Desktop\\Capgemini\\Week-05\\Day01\\src\\main\\java\\com\\basicproblems\\writecsvfile\\studentDetails.csv");

    }

}
