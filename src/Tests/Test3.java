package Tests;

// Copie o array a de 11 elementos para a primeira parte de array b, que contém 34 elementos.

public class Test3 {
    public static void main(String[] args) {
        int[] a = new int[11];

        int[] b = new int[34];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        System.arraycopy(a, 0, b, 0, a.length);

        for (int arr : b) {
            if (arr == 0) {
                return;
            } else {
                System.out.println(arr);
            }
        }


    }
}
