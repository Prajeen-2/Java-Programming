import java.util.Scanner;
class main {
    public static void myMethod(String defaultUsername, String defaultPassword) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username to login: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter password to login: ");
        String enteredPassword = scanner.nextLine();
        if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
            System.out.println("Logged in successfully!, Welcome to Instagram");
        } else {
            System.out.println("Invalid username or password");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set default username: ");
        String defaultUsername = scanner.nextLine();
        System.out.print("Set default password: ");
        String defaultPassword = scanner.nextLine();
        myMethod(defaultUsername, defaultPassword);
    }
}
