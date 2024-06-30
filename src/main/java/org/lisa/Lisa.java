package org.lisa;

import java.util.Scanner;

public class Lisa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two number. First: ");
        double num1 = scanner.nextDouble();
        System.out.println("Second: ");
        double num2 = scanner.nextDouble();
        System.out.println("Input a action (/ * - +) : ");
        String sign = scanner.next();

        switch (sign) {
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("You did not enter an action. Reboot");
                break;
        }
    }
}
