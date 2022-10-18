package javaweek7hwhimesh;

import java.util.Scanner;

public class Que8 {
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
        if (city == 'A' || city == 'a') {
            System.out.println("Ahmedabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Baroda");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chotila");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dahod");
        } else if (city == 'E' || city == 'e') {
            System.out.println("England");
        } else if (city == 'F' || city == 'f') {
            System.out.println("France");
        } else {
            System.out.println("Enter valid Initial of city");
        }
    }
}