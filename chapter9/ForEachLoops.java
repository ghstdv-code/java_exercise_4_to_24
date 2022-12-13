package chapter9;

public class ForEachLoops {
    public static void main(String[] args) {
        int numbers[] = {235, 58, 98, 54, 69, 47};
        int sum = 0;

        for(int nsum: numbers){
            sum += nsum;
        }

        System.out.println("Sum : " + sum);
    }
}
