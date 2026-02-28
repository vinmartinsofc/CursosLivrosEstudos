package Deitel10th.ChapterIII;

public class Invoice {
    private String number;
    private String description;
    private int itemsCount;
    private double price;

    public Invoice(String number, String description, int boughtAmount, double price) {
        this.number = number;
        this.description = description;
        this.itemsCount = boughtAmount;
        this.price = price;
    }

    public double getInvoiceAmount() {
        double calculation = price * itemsCount;

        if (price < 0.0) {
            price = 0.0;
        } else if (itemsCount < 0.0) {
            itemsCount = 0;
        }

        return calculation;
    }


}



