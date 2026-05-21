package CodeRefiner.Ex06;

public class Product {
    private String name;
    private double price;
    private int stockAmount;
    private static int totalRegisteredProducts = 0;

    public Product(String name, double price, int stockAmount) {
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
        ++totalRegisteredProducts;
    }

    public double applyDiscountOf(double percentage) {
        double calc = price * (percentage / 100);
        return  price -= calc;
    }

    public static int getTotalRegisteredProducts() {
        return  totalRegisteredProducts;
    }

    public void showInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Amount: " + stockAmount);
    }


}
