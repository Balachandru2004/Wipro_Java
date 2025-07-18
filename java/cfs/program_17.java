package cfs;

import java.util.Scanner;

public class program_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int n = scanner.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            // Print numbers incrementally in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
