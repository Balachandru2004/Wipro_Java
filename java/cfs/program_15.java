package cfs;

public class program_15 {
    public static void main(String[] args) {
        for (int num = 10; num < 100; num++) {
            if (num > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(num);
                }
            }
        }
    }
}
