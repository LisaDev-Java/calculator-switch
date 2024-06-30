package org.lisa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lisa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input two number: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.print("Input a action (/ * - +) : ");
        String sign = scanner.next();

        switch (sign) {
            case "/":
                System.out.println(num1 / num2);
            case "*":
                System.out.println(num1 * num2);
            case "+":
                System.out.println(num1 + num2);
            case "-":
                System.out.println(num1 - num2);
        }
    }
}                                                      // Переделать на Switch
