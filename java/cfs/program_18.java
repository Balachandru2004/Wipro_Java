package cfs;

import java.util.Scanner;

public class program_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        int left = 0;
        int right = numStr.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }

        sc.close();
    }
}
