package javaweek7hwhimesh;

import java.util.Arrays;

public class Que17 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[] ar1 = {4, 2, 6, 9, 5, 8, 3, 1, 7};
        String[] ar2 = {"DEF", "VWX", "MNO", "ABC", "PQR", "YZ", "GHI", "STU", "JKL"};

        System.out.println("Displayed number array: " + Arrays.toString(ar1));
        Arrays.sort(ar1);
        System.out.println("Sorted number array: " + Arrays.toString(ar1));

        System.out.println("Displayed string array: " + Arrays.toString(ar2));
        Arrays.sort(ar2);
        System.out.println("Sorted string array: " + Arrays.toString(ar2));
    }
}
