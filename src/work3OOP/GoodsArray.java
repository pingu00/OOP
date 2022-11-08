package work3OOP;
import java.util.Scanner;

public class GoodsArray {
    public static void main(String[] args) {
        Goods[] goodsArray;
        Scanner s = new Scanner(System.in);
        System.out.print("슈퍼에서 취급하는 상품의 개수를 입력하시오>>>");
        int numOfGoods = s.nextInt();
        goodsArray = new Goods[numOfGoods];

        for (int i = 0; i < goodsArray.length; i++) {
            System.out.print(i + 1 + "번째 상품의 이름 가격 재고량 입력하시오>>>> ");
            String name = s.next();
            int price = s.nextInt();
            int n = s.nextInt();
            goodsArray[i] = new Goods(name, price, n);
        }

        boolean run = true;

        while (run) {
            System.out.println("1) 판매 2) 구매 3) 조회 4) 종료");
            int function = s.nextInt();
            switch (function) {
                case 1:
                    sell(numOfGoods, goodsArray);
                    break;
                case 2:
                    buy(numOfGoods, goodsArray);
                    break;
                case 3:
                    search(goodsArray);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }

        }

    }


    static void sell(int numOfGoods, Goods[] goodsArray) {
        Scanner s = new Scanner(System.in);
        int totalPrice = 0;
        int[] chooseGoods = new int[numOfGoods];
        while (true) {
            for (int i = 0; i < goodsArray.length; i++) {
                System.out.print(i + 1 + ")" + goodsArray[i].getName() + " ");
            }
            System.out.println(numOfGoods + 1 + ")" + "계산");
            System.out.print(">>>");

            int chooseNum = s.nextInt();
            if (chooseNum == numOfGoods + 1) {
                break;
            }
            chooseGoods[chooseNum - 1] += 1;
        }
        for (int i = 0; i < goodsArray.length; i++) {
            totalPrice += chooseGoods[i] * goodsArray[i].getPrice();
            goodsArray[i].setNumberOfStock(goodsArray[i].getNumberOfStock() - chooseGoods[i]);
        }
        System.out.println("판매가격 총액" + totalPrice);
        System.out.print("받은금액을 입력하시오>>>");
        int clientPrice = s.nextInt();
        int chageMoney = clientPrice - totalPrice;

        System.out.println("### 영수증 ###");
        System.out.println("==========================");
        for (int i = 0; i < goodsArray.length; i++) {
            System.out.print(goodsArray[i].getName() + " ");
            System.out.println(goodsArray[i].getPrice() + "X" + chooseGoods[i] + "   " + goodsArray[i].getPrice() * chooseGoods[i]);
        }
        System.out.println("==========================");
        System.out.println("총액         " + totalPrice);
        System.out.println("받은금액       " + clientPrice);
        System.out.println("==========================");
        System.out.println("거스름돈         " + chageMoney);
    }

    public static void search(Goods[] goodsArray) {
        System.out.print("###  상품명   재고량  ### ");
        System.out.println("==========================");
        for (int i = 0; i < goodsArray.length; i++) {
            System.out.print(goodsArray[i].getName() + "   ");
            System.out.println(goodsArray[i].getNumberOfStock());
        }
        System.out.println("==========================");
    }

    public static void buy(int numOfGoods, Goods[] goodsArray) {
        Scanner s = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < goodsArray.length; i++) {
                System.out.print(i + 1 + ")" + goodsArray[i].getName() + " ");
            }
            System.out.println(numOfGoods + 1 + ")" + "구매종료");
            int chooseNum = s.nextInt();
            if (chooseNum == numOfGoods + 1) {
                break;
            }
            System.out.print("구매 수량을 입력하시오 >>> ");
            int numberOfBuy = s.nextInt();
            goodsArray[chooseNum-1].setNumberOfStock(goodsArray[chooseNum-1].getNumberOfStock() + numberOfBuy);
        }
    }

}