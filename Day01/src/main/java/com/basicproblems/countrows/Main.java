package com.basicproblems.countrows;

public class Main {

    public static void main(String[] args) {

        ReadData rd = new ReadData();

        //path of the file
        String path = "C:\\Users\\Adarsh Gupta\\Desktop\\Capgemini\\Week-05\\Day01\\src\\main\\java\\com\\basicproblems\\countrows\\studentDetails.csv";

        //passing the file path in the argument
        rd.readData(path);


    }
}
