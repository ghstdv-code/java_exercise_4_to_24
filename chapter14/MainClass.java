package chapter14;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Name  : ");
        String name = sc.nextLine();
        System.out.print("Price : ");
        float price = sc.nextFloat();
        sc.close();

        new Product(name, price);
        }
}
