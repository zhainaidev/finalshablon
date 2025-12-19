package com.example.dip;

public class Main {

    public static void main(String[] args) {
        Database database = new MySQLDatabase();

        DataProcessor processor = new DataProcessor(database);

        processor.process();
    }
}