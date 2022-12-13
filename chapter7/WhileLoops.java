package chapter7;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int lf = 3;
        String ans;

        while(lf > 0){
            System.out.println("What is the only natural satellite of the earth?");
            System.out.print("Answer : ");
            ans = sc.nextLine();

            if(ans.equalsIgnoreCase("moon")) break;
            else lf--;
            
        }

        sc.close();
        if(lf > 0) System.out.println("You WON!");
        else System.out.println("You LOST!");
    }
}

