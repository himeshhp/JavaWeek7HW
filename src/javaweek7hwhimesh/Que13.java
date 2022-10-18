package javaweek7hwhimesh;

import java.util.Scanner;

public class Que13 {
    static int a;

    public static void main(String[] args) {
        getDay();
    }

    public static void weekSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 7 to get week day accordingly ");
        a = sc.nextInt();
    }

    public static void getDay() {
        weekSelection();
        switch (a){
            case (1):
            System.out.println("Monday");
            break;
            case (2):
            System.out.println("Tuesday");
            break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
