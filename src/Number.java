import java.util.Scanner;

public class Number {
    int add(int a, int b) { return a + b;}
    String add(String a, String b) { return a + b; }

    public static void main(String[] args) {

        Number number = new Number();
        int sumInt = number.add(2, 3);
        System.out.printf("2 + 3 = %d\n", sumInt);
        String sumString = number.add("hell", "o");
        System.out.printf("hell + o  = %s\n",sumString);
    }
}
