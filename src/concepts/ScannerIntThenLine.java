package concepts;

import java.util.Scanner;

public class ScannerIntThenLine {
    public static void main(String[] args){
        // https://books.trinket.io/thinkjava2/chapter3.html#sec43
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
