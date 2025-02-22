package org.example.engines;

import org.example.services.ValidationService;

import java.util.Scanner;

public class RunEngine {

    ValidationService validationService = new ValidationService();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Hello and welcome to the library!");


        while (true) {
            System.out.println("Who are you? [L]ibrarian, [G]uest, [M]ember, [H]acker]");
            input = scanner.nextLine().toUpperCase();

            if (validationService.validateInput(input)) {
                break;
            } else {
                System.out.println("Invalid input, please try again");
            }
        }


        switch (input) {
            case "L":
                System.out.println("You are a librarian");
                break;
            case "G":
                System.out.println("You are a guest");
                break;
            case "M":
                System.out.println("You are a member");
                break;
            case "H":
                System.out.println("You are a hacker");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}