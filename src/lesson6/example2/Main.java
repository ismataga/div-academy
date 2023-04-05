package lesson6.example2;

import lesson6.example1.Company;
import lesson6.example1.MarketA;
import lesson6.example1.MarketB;

public class Main {
    public static void main(String[] args) {
        MarketA marketA = new MarketA();
        System.out.println(marketA.getProduct() + ": " + marketA.getPrice());
        MarketB marketB = new MarketB();
        System.out.println(marketB.getProduct() + ": " + marketB.getPrice());


    }
}
