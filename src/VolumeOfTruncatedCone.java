import java.util.Scanner;


import java.util.Scanner;
public class VolumeOfTruncatedCone {
    public static void main(String[] args) {
        double R1,R2,Height;
        double result;
        double PIE = 3.14;
        Scanner Sc =new Scanner(System.in);

        System.out.println("월뿔대의 부피를 구해주는 프로그램");

        System.out.print("R1를 입력하세요\n");
        R1=Sc.nextDouble();

        System.out.print("R1를 입력하세요\n");
        R2=Sc.nextDouble();

        System.out.print("Height를 입력하세요\n");
        Height=Sc.nextDouble();

        result = (R1 * R1+R1*R2+R2*R2 )/3 *PIE *Height;
        System.out.print("월뿔대의 부피는: " +result);

    }
}
