package cfs;

public class main_4 {
    public static void main(String[] args) {
        // Check if no command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No Values");
        } else {
            // Initialize an empty output string
            String output = "";

            // Loop through the arguments
            for (int i = 0; i < args.length; i++) {
                output += args[i];

                // Add comma and space except after the last element
                if (i < args.length - 1) {
                    output += ", ";
                }
            }

            // Print the final output
            System.out.println(output);
        }
    }
}
