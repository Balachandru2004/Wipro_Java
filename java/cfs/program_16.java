package cfs;

import java.util.Scanner;

public class program_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of all the digits is: " + sum);
    }
}
