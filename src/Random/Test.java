package Random;

public class Test {
    public static void main(String[] args) {
        int[] testList = new int[5];

        for (int i = 0; i < testList.length; i++) {
            testList[i] = i;

        }


        for (int i : testList) {
            System.out.println(i);
        }



    }


}
