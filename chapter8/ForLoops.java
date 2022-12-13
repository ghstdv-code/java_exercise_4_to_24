package chapter8;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String unames[] = {"Natsu", "Tatsumi", "Zeref"};
        String pws[] = {"natsu32", "nightraid", "blackwiz"};

        String acct[] = new String[2];
        System.out.print("Username : ");
        acct[0] = sc.nextLine();
        System.out.print("Password : ");
        acct[1] = sc.nextLine();
        sc.close();

        boolean isExist = false;

        for(int i = 0; i < unames.length; i ++){
            if (acct[0].equals(unames[i]) && acct[1].equals(pws[i])){
                isExist = true;
                break;
            }
        }

        if(isExist) System.out.println("Welcome " + acct[0]);
        else System.out.println("Account not Found!");
    }
}
