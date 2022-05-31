import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        double determinant;
        double root;
        double x1,x2;
        Scanner Sc =new Scanner(System.in);

        System.out.println("근의공식에의한 해를 구해주는 프로그램");

        System.out.print("input a\n");
        a=Sc.nextInt();

        System.out.print("input b\n");
        b=Sc.nextInt();

        System.out.print("input c\n");
        c=Sc.nextInt();


        determinant=(b*b)-(4*a*c);
        root = Math.sqrt(determinant);

        if(determinant>0){
            x1=(-b+root)/(2*a);
            x2=(-b-root)/(2*a);
            System.out.print("이차방정식의 근은 " + x1+" 과"+x2+" 두개입니다.");
        }
        if(determinant==0){
            x1=(-b+root)/(2*a);
            System.out.print("이차방정식의 근은 중근으로, "+x1+"입니다.");
        }

        if(determinant<0){
            System.out.print("이차방정식의 근이 없습니다.");
        }
    }
}
