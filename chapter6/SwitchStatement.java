package chapter6;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Month : ");
        int m = sc.nextInt();

        System.out.print("Date  : ");
        int d = sc.nextInt();

        System.out.print("Year  : ");
        int y = sc.nextInt();

        sc.close();
        String monthStr = "";

        switch(m){
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "Febuary";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;
            case 12:
                monthStr = "December";
                break;
        }

        if(monthStr.equals("")) System.out.println("Invalid Month");
        else {
            if(d > 31 || d <= 0) System.out.println("Invalid Date");
            else System.out.println(monthStr + " " + d + ", " + y);    
        } 
    }
}

