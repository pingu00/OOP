//201810766 kimpilgyu
import java.util.Arrays;
import java.util.Scanner;

public class TMain {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("201810766 kimpilgyu");

        TRect r1 = new TRect(10,150,70,-20);
        TRect r2 = new TRect(-20,70,55,50);
        TRect r3 = new TRect(20,20,100,-50);
        TRect[] r = {r1,r2,r3};
        TCircle c1 = new TCircle(20,20,10);
        TCircle c2 = new TCircle(-10,-5,5);
        TCircle c3 = new TCircle(10,15,5);
        TCircle[] c = {c1,c2,c3};

        //(1) solution
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("");

        //(2) solution
        r1.translate(5,10);
        c1.translate(5,10);
        System.out.printf("r1 moved to (%.0f,%.0f)(%.0f,%.0f) p: %.1f \n",r1.getX1(),r1.getY1(),r1.getX2(),r1.getY2(),r1.perimeter());
        System.out.printf("c1 moved to (%.0f,%.0f) ~ p: %f \n",c1.getX(),c1.getY(),c1.perimeter());

        System.out.println("");

        //(3) solution
        System.out.println("Rectangles comparing 190.00 with 460.00");
        System.out.print("comparing r1, r2 -->");
        System.out.println(r1.compareTo(r2));

        System.out.println("Circles comparing 62.83 with 31.42");
        System.out.print("comparing  c1, c2 -->");
        System.out.println(c1.compareTo(c2));
        System.out.println("");
        //(4) solution
        double sumArea = 0;
        double sumPerimeter=0;
        for(int i=0 ; i < 3 ; i++) {
            sumArea += r[i].area();
            sumArea += c[i].area();
            sumPerimeter += r[i].perimeter();
            sumPerimeter += c[i].perimeter();
        }
        System.out.println("sum of area:" + sumArea);
        System.out.println("sum of perimeter:" + sumPerimeter);


        //(5) solution
        for (TCircle circle : c) {
            System.out.printf("(%.0f,%.0f) ~ p: %f contains (30.0,30.0)  --> ",circle.getX(),circle.getY(),circle.perimeter());
            System.out.println( circle.contains(30,30));
        }


        //(6) solution



    }
}

