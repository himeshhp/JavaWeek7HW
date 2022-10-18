package javaweek7hwhimesh;

import java.util.Scanner;

public class Que10 {
    static Scanner sc = new Scanner(System.in);
    static int a, b, option;

    static float operation;

    public static void main(String[] args) {
        operation();
    }

    public static void entreNumbers() {
        System.out.println("Enter number 1: ");
        a = sc.nextInt();
        System.out.println("Enter number 2: ");
        b = sc.nextInt();
    }

    public static void operation() {
        entreNumbers();

        System.out.println("Select any operator:");
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");
        option = sc.nextInt();

        if (option == 1) {
            operation = a + b;
            System.out.println("You selected Addition");
            System.out.println("Output is " + operation);
        } else if (option == 2) {
            operation = a - b;
            System.out.println("You selected Subtraction");
            System.out.println("Output is " + operation);
        } else if (option == 3) {
            operation = a * b;
            System.out.println("You selected Multiplication");
            System.out.println("Output is " + operation);
        } else if (option == 4) {
            operation = a / b;
            System.out.println("You selected Division");
            System.out.println("Output is " + operation);
        } else {
            System.out.println("Select valid Operator");
        }
    }


}
