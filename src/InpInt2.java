import java.util.Scanner;

public class InpInt2 {
    public static void main(String [] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num != 0) {
                System.out.println(num);
            } else {
                break;
            }
        } while (true);
    }
}
