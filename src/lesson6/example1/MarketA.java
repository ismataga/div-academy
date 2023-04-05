package lesson6.example1;

public class MarketA extends Company{

//    public MarketA(String product, double price) {
//        super(product, price);
//    }

    @Override
    public double getPrice() {
        return super.getPrice()+(super.getPrice()*1.5);
    }
}
