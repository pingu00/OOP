import java.util.Scanner;

public class FindStringWithForEach
{
    public static void main (String[] args){
        String [] cities = {"Newyork","Bajing","Seoul"};
        boolean found =false;
        for (String s :cities){
            if (s.equals("Seoul")){
                found = true;
                System.out.println(s);
            }
        }

    }
}
