package javaweek7hwhimesh;

import java.util.Scanner;

public class Que5 {
    static int eid, bsal;
    static float hra, ta, da, pf, gsal;
    static String name;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        salarySlip();
    }

    public static void empDetails() {
        System.out.print("Enter EmpName: ");
        name = sc.nextLine();
        System.out.print("Enter EmpId  : ");
        eid = sc.nextInt();
    }

    public static void salaryCalc() {
        System.out.println("Enter Employee basic salary: ");
        bsal = sc.nextInt();

        hra = (bsal * 10) / 100f;
        ta = (bsal * 8) / 100f;
        da = (bsal * 9) / 100f;
        pf = (bsal * 20) / 100f;
        gsal = (bsal + hra + ta + da) - pf;
    }

    public static void salarySlip() {
        empDetails();
        salaryCalc();

        System.out.println("|---------------------------|");
        System.out.println("|        Salary Slip        |");
        System.out.println("|---------------------------|");
        System.out.println("|Employee Id  : " + eid + "         |");
        System.out.println("|Employee Name: " + name + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Basic Salary : " + bsal + "       |");
        System.out.println("|HRA 10%      : " + hra + "      |");
        System.out.println("|TA   8%      : " + ta + "      |");
        System.out.println("|DA   9%      : " + da + "      |");
        System.out.println("|PF(-20%)     : " + pf + "      |");
        System.out.println("|---------------------------|");
        System.out.println("|Gross Salary : " + gsal + "     |");
        System.out.println("|---------------------------|");
    }
}
