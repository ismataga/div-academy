package lesson6.example1;

public class MarketB extends Company{
    @Override
    public double getPrice() {
        return super.getPrice()+(super.getPrice()*0.2);
    }
}
