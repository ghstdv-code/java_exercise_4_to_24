package chapter22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("How many Students to be Registered?");
        int size = sc.nextInt();
        // to skip intiger
        sc.nextLine();

        Students student[] = new Students[size];
        for(int i = 0; i < student.length; i++){
            String firstName, lastName, course;
            int year;
            char section;

            System.out.println("Student Id Number: " + (i+1));
            
            System.out.print("First name : "); 
            firstName = sc.nextLine();
            System.out.print("Last name  : "); 
            lastName = sc.nextLine();
            
            System.out.print("Course     : ");
            course = sc.nextLine();

            System.out.print("Year       : ");
            year = sc.nextInt();
            sc.nextLine();

            System.out.print("Section    : ");
            section = sc.nextLine().charAt(0);
            
            System.out.print("\n\n");

            student[i] = new Students(firstName, lastName, course, year, section);            
        }

        sc.close();
        for(Students stud:student){
            stud.introduceSelf();
        }
    }
}
