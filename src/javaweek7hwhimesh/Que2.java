package javaweek7hwhimesh;

import java.util.Scanner;

public class Que2 {
    static int a;

    public static void main(String[] args) {
        leapYear();
    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year ");
        a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println(a + " is a Leap Year");
        } else if (a % 100 != 0) {
            System.out.println(" is not a Leap Year");
        } else if (a % 400 == 0) {
            System.out.println(" is a Leap Year");
        } else {
            System.out.println(" is not a Leap Year");
        }
    }
}
