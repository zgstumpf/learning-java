package practicequestions;

public class Problem2 {
    // Q: Write a program that calculates the sum of all even numbers between 1 and 50 using a while loop.
    public static void main(String[] args){
        int num = 1;
        int sum = 0;
        while (num <= 50) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
