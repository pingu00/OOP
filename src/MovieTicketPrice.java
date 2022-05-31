import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("select 1. from prime, standard, economy");
        String zone = sc.next();

        if(zone.compareTo("prime")== 0){
            System.out.println("11000W");
        }
        else if (zone.compareTo("standard")== 0){
            System.out.println("10000W");
        }
        else if (zone.compareTo("economy")== 0){
            System.out.println("9000W");
        }
        else {
            System.out.println("There is no select");
        }
    }
}
