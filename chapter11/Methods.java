package chapter11;

public class Methods {
    public static void main(String[] args) {
        int nums[] = {6, 2, 4, 5, 8, 10, 28, 78};
        System.out.println(summation(nums));
    }

    static int summation(int nums[]){
        int sum  = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
