package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Registration");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Success!");
        System.out.println("Registered name: " + name);
        System.out.println("Registered email " + email);
    }
}
