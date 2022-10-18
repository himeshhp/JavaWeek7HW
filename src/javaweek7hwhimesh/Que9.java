package javaweek7hwhimesh;

import java.util.Scanner;

public class Que9 {
    static char city;

    public static void main(String[] args) {
        getCityName();
    }

    public static void cityInitialSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial of city A to F || a to f to get city name: ");
        city = sc.next().charAt(0);
    }

    public static void getCityName() {
        cityInitialSelection();
        switch (city) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'b':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chotila");
                break;
            case 'c':
                System.out.println("Chotila");
                break;
            case 'D':
                System.out.println("Dahod");
                break;
            case 'd':
                System.out.println("Dahod");
                break;
            case 'E':
                System.out.println("England");
                break;
            case 'e':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("France");
                break;
            case 'f':
                System.out.println("France");
                break;
            default:
                System.out.println("Enter valid Initial of city");
        }
    }
}
