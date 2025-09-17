import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        // Hardcoded credentials (for demonstration only)
        String correctUsername = "admin";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        // Ask for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Ask for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check credentials
        if(username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        scanner.close();
    }
}

