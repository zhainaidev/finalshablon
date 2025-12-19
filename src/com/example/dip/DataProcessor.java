package com.example.dip;

public class DataProcessor {

    private final Database database;

    public DataProcessor(Database database) {
        this.database = database;
    }

    public void process() {
        database.connect();
        System.out.println("Обработка данных...");
        database.disconnect();
    }
}