package javaweek7hwhimesh;

public class Que19 {
    public static void main(String[] args) {
        avgArray();
    }

    public static void avgArray() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : ar) sum = sum + i;
        double avg = (float)sum / ar.length;
        System.out.println("Average of Array is: " + avg);
    }
}
