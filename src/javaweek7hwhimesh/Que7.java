package javaweek7hwhimesh;

import java.util.Scanner;

public class Que7 {
    static Scanner sc = new Scanner(System.in);
    static String sellersName;
    static int salesID, salesAmount, salaryBasic;
    static float commission;

    public static void main(String[] args) {
        salesCommission();
    }

    public static void salesDetails() {
        System.out.print("Enter Sales Id    : ");
        salesID = sc.nextInt();
        System.out.print("Enter Seller Name : ");
        sellersName = sc.next();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextInt();
        System.out.print("Enter Salary basic: ");
        salaryBasic = sc.nextInt();
    }

    public static void salesCommission() {
        salesDetails();
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100f;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100f;
            System.out.println("Commission is: " + commission);
        }else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100f;
            System.out.println("Commission is: " + commission);
        }else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100f;
            System.out.println("Commission is: " + commission);
        }else {
            commission = (salesAmount * 2) / 100f;
            System.out.println("Commission is: " + commission);
        }
    }
}
