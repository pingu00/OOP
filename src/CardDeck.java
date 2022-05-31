public class CardDeck {
    int cardCount = 3 ;
    String shape = "diamond";
    int cardNum[] = new int[cardCount];

    {
        for (int i = 0; i < cardCount; i++) {
            cardNum[i] = (int) Math.floor(Math.random() * 9) + 2;
        }
    }
    public void deal() {
        System.out.println("Shape :" + shape);

        System.out.println("Number :" + cardNum[cardCount-1]);
         cardCount-- ;
    }
    public static void main(String[] args) {
        CardDeck c1 = new CardDeck();
        System.out.println("How many card?: " + c1.cardCount);
        c1.deal();
        System.out.println("How many card?: " + c1.cardCount);
        c1.deal();
        System.out.println("How many card?: " + c1.cardCount);
    }
}
