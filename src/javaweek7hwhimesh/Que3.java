package javaweek7hwhimesh;

import java.util.Scanner;

public class Que3 {
    static String name, result, grade;
    static int rollno, maths, science, english, total;
    static float percentage;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        marksheet();
    }

    public static void studentDetails() {

        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
    }

    public static void subjectMarks() {
        System.out.print("Enter Maths marks:   ");
        maths = sc.nextInt();
        if (maths > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100");
            System.out.print("Enter Maths marks: ");
            maths = sc.nextInt();
        }

        System.out.print("Enter Science marks: ");
        science = sc.nextInt();
        if (science > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100");
            System.out.print("Enter Science marks: ");
            science = sc.nextInt();
        }

        System.out.print("Enter English marks: ");
        english = sc.nextInt();
        if (english > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100");
            System.out.print("Enter English marks: ");
            english = sc.nextInt();
        }
    }

    public static void calculation() {
        subjectMarks();
        total = maths + science + english;
        percentage = total / 3f;

        if (maths >= 35 && science >= 35 && english >= 35 && percentage >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    public static void marksheet() {
        studentDetails();
        calculation();
        System.out.println(" ");
        System.out.println("|------------------------------|");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|------------------------------|");
        System.out.println("|Name   : " + name + "               |");
        System.out.println("|RollNo : " + rollno + "                  |");
        System.out.println("|------------------------------|");
        System.out.println("|Subject  Marks                |");
        System.out.println("|------------------------------|");
        System.out.println("|Maths   : " + maths + "                  |");
        System.out.println("|Science : " + science + "                  |");
        System.out.println("|English : " + english + "                  |");
        System.out.println("|------------------------------|");
        System.out.println("|Total   : " + total + "                 |");
        System.out.println("|------------------------------|");
        System.out.println("|Percentage: " + percentage + "              |");
        System.out.println("|Result    : " + result + "              |");
        System.out.println("|Grade     : " + grade + "                |");
        System.out.println("|------------------------------|");
    }
}
