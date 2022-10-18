package javaweek7hwhimesh;

import java.util.Scanner;

public class Que4 {


    public static void main(String[] args) {
        int yr, mnt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year: ");
        yr = sc.nextInt();
        isLeapYear(yr);
        System.out.println("Enter any Month: ");
        mnt = sc.nextInt();
        getDaysInMonth(mnt, yr);
    }

    public static void isLeapYear(int year) {
        if (year > 1 && year < 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " Is a Leap Year");
            } else {
                System.out.println(year + " Is not a Leap Year");
            }
        } else {
            System.out.println("False");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            System.out.print("-1");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            switch (month) {
                case 2:
                    System.out.println("29 Days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days");
                    break;
                default:
                    System.out.println("-1");
                    break;
            }
        } else {
            switch (month) {
                case 2:
                    System.out.println("28 Days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 Days");
                    break;
                default:
                    System.out.println("-1");
                    break;
            }
        }
    }
}