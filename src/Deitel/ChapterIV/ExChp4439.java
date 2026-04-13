package Deitel.ChapterIV;


public class ExChp4439 {
    public static void main(String[] args) {

        double rate = 0.35;
        double population = 214.2;
        int yearNumber = 1;

        while (yearNumber < 76) {
            double temp = population * rate;
            population += temp;

            System.out.printf("Pop rate = %.2f%n", population);

            if (population > 214.2 * 2) {
                System.out.println("In the year "+ yearNumber + " the population has duplicated its value:" + population);
            }

            if (yearNumber == 75) {
                System.out.printf("Estimated Population size at the year 75: %.2f%n ",population);
            }


            yearNumber++;
        }


    }
}
