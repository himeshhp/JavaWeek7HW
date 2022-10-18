package javaweek7hwhimesh;

import java.util.Scanner;

public class Que16 {
    static int num;

    public static void main(String[] args) {
        numChk();
    }

    public static void enterNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check is it POSITIVE, NEGATIVE or ZERO ");
        num = sc.nextInt();
    }

    public static void numChk() {
        enterNum();

        if (num > 0) {
            System.out.println("Number is POSITIVE");
        } else if (num < 0) {
            System.out.println("Number is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }
    }
}
