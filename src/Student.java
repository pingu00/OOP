
import java.util.Arrays;

public class Student {
    String name;
    int number;
    double gpa;

    Student(String name,int number, double gpa) {
        this.name = name;
        this.number = number;
        this.gpa =gpa;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public double getGpa() {
        return gpa;
    }

    public String toString() {
        String s = "이름:" + getName() + " 학번:"+ getNumber() + " GPA:" +getGpa();
        return s;
    }


}
