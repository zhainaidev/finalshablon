package com.example.dip;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Подключение к MySQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключение от MySQL...");
    }
}