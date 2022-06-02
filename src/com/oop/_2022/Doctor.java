package com.oop._2022;

public class Doctor {
    private int id ;
    private String name;

    public Doctor(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString() {
        return "Doctor{" +
                "name:'" + name + '\'' +
                ", id:'" + id + '\'' +
                '}';
    }
}
