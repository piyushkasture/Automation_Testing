package lab;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wage = 600;
        System.out.print("Enter month : ");
        String month = sc.next();

        int days = 0;

        switch (month) {
            case "jan": days = 31; break;
            case "feb": 
            	System.out.print("Enter year: ");
                int year = sc.nextInt();
                
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case "mar": days = 31; break;
            case "apr": days = 30; break;
            case "may": days = 31; break;
            case "jun": days = 30; break;
            case "jul": days = 31; break;
            case "aug": days = 31; break;
            case "sep": days = 30; break;
            case "oct": days = 31; break;
            case "nov": days = 30; break;
            case "dec": days = 31; break;
            default:
                System.out.println("Invalid month entered!");
        }

        int result = wage * days;
        System.out.println("Monthly " + month + " salary in " + ": " + result);
    }
}