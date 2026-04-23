package Deitel.ChapterV;

public class ExChap5513 {
    public static void main(String[] args) {
        long result = 1;


        for (int i = 1; i < 100; i++) {

            result = i * result;
        }

        System.out.printf("%n:%d", result);

    }
}
