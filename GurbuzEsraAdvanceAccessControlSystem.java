/***********************************************************************
@Title:	GurbuzEsraAdvanceAccessControlSystem
@Purpose:	To practice java loop and conditional statements.
@Author:    Gurbuz Esra
@Date:   	11.14.2024 14th of November
@Version:	1.0
**********************************************************************/

import java.util.Scanner;

public class GurbuzEsraAdvanceAccessControlSystem {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the time (0\\23): ");
        int time = keyboard.nextInt();

        if (time >= 0 && time <= 23) {
            System.out.printf("Time: %d\n", time);

            System.out.println("Enter your security level (1\\5): ");
            int securityLevel = keyboard.nextInt();

            if (securityLevel >= 1 && securityLevel <= 5) {
                System.out.printf("Security level: %d\n", securityLevel);

                if (securityLevel == 5) {
                    System.out.println("Access Granted.");
                } else {
                    System.out.println("Enter your role (ADMIN, USER, GUEST): ");
                    String role = keyboard.next();

                    if (role.equalsIgnoreCase("ADMIN") || role.equalsIgnoreCase("USER") || role.equalsIgnoreCase("GUEST")) {
                        System.out.printf("Role: %s\n", role);

                        if (securityLevel >= 4 && role.equalsIgnoreCase("ADMIN")) {
                            System.out.println("Access Granted.");
                        } else if (securityLevel >= 3 && role.equalsIgnoreCase("USER") && time >= 9 && time <= 17) {
                            System.out.println("Access Granted.");
                        } else if (securityLevel >= 2 && role.equalsIgnoreCase("GUEST") && time >= 10 && time <= 16) {
                            System.out.println("Access Granted.");
                        } else {
                            System.out.println("Access Denied.");
                        }
                    } else {
                        System.out.println("You entered an invalid role. Access denied.");
                    }
                }
            } else {
                System.out.println("You entered a security level out of the allowed range. Access denied.");
            }
        } else {
            System.out.println("You entered an invalid time. Access denied.");
        }

    }
}
