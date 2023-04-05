package lesson6.example1;

public class Company {
    private String product="oil" ;
    private double price =0.15;

    public double getPrice(){
        return  price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product=product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Company(String product, double price) {
//        this.product = product;
//        this.price = price;
//    }
}
