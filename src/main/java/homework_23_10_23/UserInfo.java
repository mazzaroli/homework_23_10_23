package homework_23_10_23;
/*
Create a simple system.out app.
Print info about the user that should be passed to the main function as a parameter.
Compile and run the program from the command line using javac and java from JDK.
 */

// To run this code, use "java PATH/homework_23_10_23.UserInfo.java one two three" on the terminal
public class UserInfo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No user information provided.");
            return;
        }

        // Prints each argument that was passed to the program.
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}