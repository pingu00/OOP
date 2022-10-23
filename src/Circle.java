import java.util.Scanner;

public class Circle {
    double radius; // 원의 반지름 필드
    String name; // 원의 이름 필드
    double area;
    double round;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
        area = radius * radius * 3.14;
        round = radius * 2 * 3.14;

    } // 원의 생성자

    public double getArea() { // 원의 면적 계산 메소드
        return area;
    }
    public double getRound() {
        return round;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("원의 이름과 반지름을 입력하시오:");
        Circle r1 = new Circle(sc.nextLine(), sc.nextDouble()); // Circle 객체 생성
        System.out.println(r1.name + "의 면적은 " + r1.getArea() + " 둘레는" + r1. getRound());


    }
}
