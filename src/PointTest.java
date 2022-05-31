import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;
public class PointTest {
        public static void main(String[] args) {
            Block1 b = new Block1(10, 10);
            Rectangle r = new Rectangle(new Point(10, 10));
            Rectangle r2 = new Rectangle(new Point(20, 20), new Point(70, 70));
            System.out.println("r");
            System.out.println(r);
            System.out.println("r2");
            System.out.println(r2);
            System.out.println("b");
            System.out.println(b);
            b.translate(10, -10);
            System.out.println("translated b");
            System.out.println(b);

            Block2 b2 = new Block2(100, 100);

            System.out.println("b2");
            System.out.println(b2);
            b.translate(10, -10);
            System.out.println("translated b2");
            System.out.println(b2);

            Block3 b3 = new Block3(300, 300);

            System.out.println("b3");
            System.out.println(b3);
            b.translate(10, -10);
            System.out.println("translated b3");
            System.out.println(b3);
        }
}
