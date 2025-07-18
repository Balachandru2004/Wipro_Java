package cfs;

public class program_6 {
    public static void main(String[] args) {
        char value = 'a'; // Change this to test other characters

        if (Character.isLetter(value)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(value)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
