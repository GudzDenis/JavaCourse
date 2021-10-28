package com.company;
import java.util.Scanner;

import java.lang.constant.Constable;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char action;

    public void calculate() {
        try{
            firstNumber = getNumberFromConsole();
            action = getActionFromConsole();
            secondNumber = getNumberFromConsole();

            switch(action){
                case '+':
                    System.out.println(firstNumber+secondNumber);
                    break;
                case '-':
                    System.out.println(firstNumber-secondNumber);
                    break;
                case '*':
                    System.out.println(firstNumber*secondNumber);
                    break;
                case '/':
                    System.out.println(firstNumber/secondNumber);
                    break;
                default:
                    break;
            }
        } catch(NumberFormatException e) {
            System.out.println("Error!" + e.getMessage());
        } catch(WrongMathOperationException e) {
            System.out.println("Error!" + e.getMessage());
        } catch( Exception e) {
            System.out.println("Something went wrong");
        }
    }

    private char getActionFromConsole() throws WrongMathOperationException {
        var scanner = new Scanner(System.in);

        var action = scanner.nextLine();

        switch(action){
            case "+":
                return '+';
            case "-":
                return '-';
            case "*":
                return '*';
            case "/":
                return '/';
            default:
                throw new WrongMathOperationException("Input unknown operation - " + action);
        }
    }

    private int getNumberFromConsole() throws NumberFormatException {
        var scanner = new Scanner(System.in);

        return Integer.parseInt(scanner.nextLine());
    }
}
