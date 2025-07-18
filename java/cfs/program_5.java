package cfs;

public class program_5 {
    public static void main(String[] args) {
        char a = 'x';
        char b = 'y';

        if (a < b) {
            System.out.println(a);
        } else if (b < a) {
            System.out.println(b);
        } else {
            System.out.println("Both characters are the same");
        }
    }
}
