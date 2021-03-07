package com.company;

public class Application { //Application class
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        Database bar = Database.getInstance();
        foo.setDatabaseName("PostgreSQL");
        foo.printDatabaseName();
        bar.setDatabaseName("MySQL");
        bar.printDatabaseName();
    }
}