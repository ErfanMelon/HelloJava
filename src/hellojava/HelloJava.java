/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Scanner;

/**
 *
 * @author Erfan
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("Please Enter "
                + "\n + For Sum "
                + "\n - For Subtract "
                + "\n * For Product "
                + "\n / For Division "
                + "\n:");
        Scanner inputs = new Scanner(System.in);
        String input = inputs.nextLine();
        System.out.print("Please Enter First Number : ");
        double num1 = inputs.nextDouble();
        System.out.print("Please Enter Second Number : ");
        double num2 = inputs.nextDouble();

        switch (input) {
            case "+":
                System.out.println("Sum is :" + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtract is :" + (num1 - num2));
                break;
            case "*":
                System.out.println("Product is :" + (num1 * num2));
                break;
            case "/":
                System.out.println("Division is :" + (num1 / num2));
                break;
            default:
                System.err.println("Error , Choose Valid Operand !");
                main(new String[1]);
                break;
        }
    }

}
