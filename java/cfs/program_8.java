package cfs;

import java.util.Scanner;

public class program_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        String input = scanner.nextLine().toUpperCase(); // Normalize input
        char colorCode = input.length() > 0 ? input.charAt(0) : ' ';

        switch (colorCode) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }

        scanner.close();
    }
}
