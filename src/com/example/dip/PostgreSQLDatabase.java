package com.example.dip;

public class PostgreSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Подключение к PostgreSQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от PostgreSQL...");
    }
}