package cfs;

public class program_7 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java ShortProgram <gender> <age> <char>");
            return;
        }

        String gender = args[0].toLowerCase();
        int age = Integer.parseInt(args[1]);
        char ch = args[2].charAt(0);

        double interest = -1;
        if (gender.equals("female"))
            interest = (age <= 58) ? 8.2 : (age <= 100 ? 9.2 : -1);
        else if (gender.equals("male"))
            interest = (age <= 58) ? 8.4 : (age <= 100 ? 10.5 : -1);

        if (interest != -1)
            System.out.printf("%s's interest: %.1f%%%n", capitalize(gender), interest);
        else
            System.out.println("Invalid input");

        if (Character.isLetter(ch))
            System.out.println(ch + " -> " + (Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch)));
        else
            System.out.println("Invalid character");
    }

    static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
