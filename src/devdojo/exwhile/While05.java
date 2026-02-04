package devdojo.exwhile;
//* Leia números enquanto forem positivos.

public class While05 {
    public static void main(String[] args) {
        int random = 0;
        int count = 0;

        while (!(random < 0)) {
          random = (int) (Math.random() * 999) - 10;
            System.out.println("Number: " + random);
            count++;
        }

        System.out.println("Numbers until a negative one: " + count);

    }
}
