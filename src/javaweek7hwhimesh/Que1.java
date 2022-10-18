package javaweek7hwhimesh;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String result;
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        result = a % 2 == 0 ? "Even" : "Odd";
        System.out.println("Number entered is " + result);
    }
}

