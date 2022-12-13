package chapter5;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Math     : ");
        float math = sc.nextFloat();

        System.out.print("Science  : ");
        float scie = sc.nextFloat();

        System.out.print("English  : ");
        float eng = sc.nextFloat();

        System.out.print("Computer : ");
        float comp = sc.nextFloat();

        sc.close();

        float ave = (math + scie + eng + comp) / 4;
        System.out.println("\nAverage  : " + ave);

        if(ave > 100) System.out.println("Invalid Grade");
        else if(ave >= 98) System.out.println("With Highest Honors");
        else if(ave >= 95) System.out.println("With High Honors");
        else if(ave >= 90) System.out.println("With Honors");
        else if(ave >= 75) System.out.println("Passed");
        else System.out.println("Failed");
        
    }
}
