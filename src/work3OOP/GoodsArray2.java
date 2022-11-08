package work3OOP;
import java.util.Vector;
import java.util.Scanner;
import java.util.Iterator;

public class GoodsArray2 {
    public static void main(String[] args) {
        Vector<Goods> v = new Vector<Goods>();

        Scanner s = new Scanner(System.in);
        System.out.print("물품의 개수입력>>>>");
        int number = s.nextInt();
        System.out.println("물품의 이름, 가격, 수량 입력 ");
        for (int i = 0; i< number; i ++){
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            v.add(new Goods(name,price,n));
        }

        Iterator<Goods> iterator = v.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }

    }
}
