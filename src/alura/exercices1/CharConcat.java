package alura.exercices1;

public class CharConcat {
    public static void main(String[] args) {
        char firstLetter = 'A';
        String school = "lura";
        String iam = "I'm studying at";
        String restOfSentence = "and it's amazing!";

        String phrase = String.format("%s %c %s %s",iam,firstLetter,school,restOfSentence);

        System.out.println(phrase);



//        System.out.println(String.format("%s %c %s %s",iam,firstLetter, school,restOfSentence));




    }

}
