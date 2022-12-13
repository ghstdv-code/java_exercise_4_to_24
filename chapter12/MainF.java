package chapter12;

import mathematics.*;

public class MainF {
    public static void main(String[] args) {
        var arithmetic = new Arithmetic();
        
        System.out.println(arithmetic.add(5, 12));
        System.out.println(Constants.pi);
        // Static Modifier for accessing directly from class
    }
}
