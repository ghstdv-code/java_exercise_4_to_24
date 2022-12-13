package chapter10;

public class TwoDimentionArraysandNesteedLoop {
    public static void main(String[] args) {
        String users[][] = {
            {"Paslm", "psalm123"},
            {"Prism", "prism456"},
            {"Tobleron", "Goya", "Hazelnut"},
            {"Volvo", "Honda", "Toyota", "Mitsubushi"}
        };

        for(String user[]: users){
            for(String info: user){
                System.out.println(info);
            }
            System.out.println();
        }
    }
}
