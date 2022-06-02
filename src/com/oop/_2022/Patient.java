package com.oop._2022;

import java.util.Date;
public class Patient {
    private String id ;
    private String name;
    public Patient(String name){
        this.name = name;
        Date d = new Date();
        long t = d.getTime();
        this.id = t + name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name:'" + name + '\'' +
                ", id:'" + id + '\'' +
                '}';
    }
}
