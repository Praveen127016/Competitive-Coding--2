import java.util.Scanner;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if ("@#!$%^&*()-+".indexOf(c) >= 0) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password to validate: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is VALID ✅");
        } else {
            System.out.println("Password is INVALID ❌. Must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- One uppercase letter");
            System.out.println("- One lowercase letter");
            System.out.println("- One digit");
            System.out.println("- One special character (@, #, !, etc.)");
        }

        sc.close();
    }
}
