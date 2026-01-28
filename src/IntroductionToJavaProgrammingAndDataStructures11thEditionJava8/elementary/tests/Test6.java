package IntroductionToJavaProgrammingAndDataStructures11thEditionJava8.elementary.tests;

public class Test6 {
    public static void main(String[] args) {
//        What is the result of 25 / 4? How would you rewrite the expression if you wished
//the result to be a floating-point number?

        double simpleDivision = 25d / 4;

        float simpleWithFloat = (float) simpleDivision;

        float reWrittenWithFloat = 25f / 4f;

        System.out.println(simpleDivision);

        System.out.println("Casted of double to Float: " + simpleWithFloat);

        System.out.println("Rewritten with floating point: " + reWrittenWithFloat);




    }
}
