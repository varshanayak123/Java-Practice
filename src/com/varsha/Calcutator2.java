package com.varsha;

import java.util.Scanner;

public class Calcutator2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        System.out.println("Enter Operator (+,-,*,/)");
        char operator = sc.next().charAt(0);
        System.out.println("Enter number");
        double b = sc.nextDouble();
        double result;
        switch (operator){
            case '+':
                result = a+b;
                break;
                case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("The result is: "+ result);

    }
}
