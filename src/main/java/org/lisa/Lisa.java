package org.lisa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lisa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input two number. First: ");
        double num1 = scanner.nextDouble();
        System.out.print("Second: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input a action (/ * - +) : ");
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
        }
    }
}
