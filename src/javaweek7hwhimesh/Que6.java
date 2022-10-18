package javaweek7hwhimesh;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Entered number is EVEN");
        } else {
            System.out.println("Entered number is ODD");
        }
    }
}
