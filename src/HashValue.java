import java.util.Arrays;
import java.util.Scanner;


import static java.lang.Math.pow;

public class HashValue {
    public static double encoding(char[] s, int n){
        double sum = 0;
        for (int i=0; i < n ; i++){
            sum += s[i] * pow(31, n - 1 - i);
        }

       return sum;
    }




    public static void main (String[] args){

        int n = 5;
        char[] s = new char[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("문자 다섯개를 한줄에 한개씩 입력하세요.");
        for(int i = 0;i < n ; i++){
            s[i] = sc.next().charAt(0);
        }
        double result = encoding(s,n);
        System.out.printf("문자열 %c%c%c%c%c의 해시값은 %.2f입니다.", s[0],s[1],s[2],s[3],s[4],result);
    }
}
