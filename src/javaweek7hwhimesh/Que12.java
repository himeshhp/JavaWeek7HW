package javaweek7hwhimesh;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        alpDigSpe();
    }

    public static void alpDigSpe() {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter single value check if it is Alphabet/Digit/Symbol ");
        ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit");
        } else {
            System.out.println(ch + " is Symbol");
        }
    }
}
