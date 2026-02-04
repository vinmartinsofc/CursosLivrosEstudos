package devdojo.tests;

public class TestAlgorithms {

    /*
    n1 ← 10
    n2 ← 30
    n3 ← n1
    n1 ← n2
    n2 ← n3
     */

    public static void main(String[] args) {
        int n1 = 10, n2 = 30, n3 = n1;

        n1 += n2;
        n2 += n3;


        System.out.println("40?" + n1);
        System.out.println("40?" + n2);
        System.out.println("50?" + n3);



    }
}
