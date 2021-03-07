package com.company;

public class Database { //Database class
    private static Database instance;
    private String name;
    private Database() {
    }
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    public void setDatabaseName(String name){
        this.name=name;
    }
    public void printDatabaseName(){
        System.out.println(this.name);
    }
}