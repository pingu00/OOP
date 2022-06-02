package com.oop._2022;

import java.time.LocalDateTime;
public class HospitalAppointment {
    Doctor d ;
    Patient p;
    LocalDateTime time;
    public HospitalAppointment(Doctor d, Patient p, LocalDateTime time){
        this.d = d;
        this.p = p;
        this.time = time;
    }
    public LocalDateTime getTime() {
        return time;
    }

    public Patient getP() {
        return p;
    }

    public Doctor getD() {
        return d;
    }
    public String toString() {
        return getTime().toString() + "\n" + getD().toString()+ "\n" + getP().toString();
    }
}
