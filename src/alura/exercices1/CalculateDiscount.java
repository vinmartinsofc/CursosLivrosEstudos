package alura.exercices1;

public class CalculateDiscount {
    public static void main(String[] args) {

        double originalPrice = 142.0;

        double discount = (5.0 / 100.0) * originalPrice;

        double applyDiscount = originalPrice - discount;


        System.out.printf(String.format("The discount of %.2f was applied. So the final price is: %.2f", discount, applyDiscount));





    }

}
