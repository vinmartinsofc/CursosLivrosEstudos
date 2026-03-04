package devdojo.exwhile;

public class While03 {
    public static void main(String[] args) {
        int conditioner;


        do {
            int rand = (int) (Math.random() * 999) - 500;
            System.out.println("I'm going to print: " + rand);
             conditioner = rand;

        } while (conditioner != -1);


    }
}
