package CodeRefiner.Ex06;

public class ProductDriver {
    public static void main(String[] args) {

        Product product = new Product("Computer Ryzen 7, 16GB RAM, GPU RTX3090", 7520, 10);
        Product product2 = new Product("One year Udemy acess for free", 10390, 5);
        Product product3 = new Product("Totally paid trip to Swiss", 15280, 3);
        Product product4 = new Product("All existing stream platforms access in one platform premium access for one year", 5000, 10);

        product.applyDiscountOf(10);
        product.showInfo();

        product2.applyDiscountOf(6);
        product2.showInfo();

        product3.showInfo();

        System.out.println("Total: " + Product.getTotalRegisteredProducts());


    }
}
