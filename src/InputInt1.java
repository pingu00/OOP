import java.util.Scanner;

public class InputInt1 {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int value;
        do{
            value = sc.nextInt();
            System.out.println("입력받은 수 : " + value);
        }while(value != 0);
    }
}
