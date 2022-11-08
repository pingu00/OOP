package work3OOP;

public class Goods {
    private String name;
    private int price;
    private int numberOfStock;


    Goods(String name, int price, int numberOfStock) {
        this.name = name;
        this.price = price;
        this.numberOfStock = numberOfStock;

    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

    String getName() {return name;}
    int getPrice() {return price;}
    int getNumberOfStock() {return numberOfStock;}

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfStock=" + numberOfStock +
                '}';
    }
}
