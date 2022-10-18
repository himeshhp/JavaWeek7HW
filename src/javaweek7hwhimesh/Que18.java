package javaweek7hwhimesh;

public class Que18 {
    public static void main(String[] args) {
        sumArray();
    }

    public static void sumArray() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : ar)
            sum += i;
        System.out.println("Sum of Array is: " + sum);
    }
}

