package com.intermediateproblems.modifyfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeSalaryUpdater {

    public static void updateSalaries(String inputFile) {
        // Create a temporary file
        String tempFile = "temp_employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(tempFile))) {

            List<String[]> records = reader.readAll();
            if (records.isEmpty()) {
                System.out.println("CSV file is empty!");
                return;
            }

            // Process each record
            for (int i = 0; i < records.size(); i++) {
                String[] record = records.get(i);

                if (i == 0) {
                    writer.writeNext(record);
                    continue;
                }

                if (record.length < 4) continue;

                String department = record[2];
                if ("IT".equalsIgnoreCase(department)) {
                    try {
                        double salary = Double.parseDouble(record[3]);
                        salary *= 1.10;
                        record[3] = String.format("%.2f", salary);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid salary data: " + record[3]);
                    }
                }

                writer.writeNext(record);
            }

            System.out.println("Updated salaries saved to temporary file: " + tempFile);

        } catch (IOException e) {
            System.err.println("Error processing CSV file: " + e.getMessage());
            return;
        } catch (CsvException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            return;
        }

        File originalFile = new File(inputFile);
        File tempFileObj = new File(tempFile);

        if (originalFile.delete()) {
            if (tempFileObj.renameTo(originalFile)) {
                System.out.println("Original file updated successfully: " + inputFile);
            } else {
                System.err.println("Error replacing the original file with the temporary file.");
            }
        } else {
            System.err.println("Error deleting the original file.");
        }
    }

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\Adarsh Gupta\\Desktop\\Capgemini\\Week-05\\Day01\\src\\main\\java\\com\\intermediateproblems\\modifyfile\\employees.csv";

        updateSalaries(inputFile);
    }
}