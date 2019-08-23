package se.ecutb.magnus;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("---Welcome to Magnus Calculator---");
        calculatorMenu(); //Hade kanske inte varit nödvändigt att lägga kalkylatormeny utanför main, men kul att testa.
        System.out.println("---Have a nice day!---");
    }

    public static void calculatorMenu(){ //Kan inte testa med scanner
        double number1, number2;
        char arithmetic, choice;
        boolean keepAlive = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Select counting operation (+,-,*,/): "); //Vill att  programmet ska likna en kalkylator
        arithmetic = scanner.next().charAt(0);//Fick googla lite
        System.out.print("Enter second number: ");
        number2 = scanner.nextDouble();
        calc(arithmetic, number1, number2);
        System.out.print("New calculation? y/n: ");
        while(keepAlive){
            choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N'){
                keepAlive = false;
            }else if (choice == 'y' || choice == 'Y'){
                calculatorMenu(); //Hade kanske varit bättre med en loop, men koden blev rörig
            }else{
                System.out.print("Unrecognized input! ");
                System.out.print("New calculation? y/n: ");
            }
        }
    }
    public static double calc(char arithmetic, double number1, double number2){ //Var från början en void metod, ändrade till double att kunna testa
        double sum = 0.0; //Fick lägga till värde för att returnera sum efter swich

        switch (arithmetic){
            case '+':
                sum = addition(number1, number2);
                System.out.println(number1 + " + " + number2 + " = " + sum);
                break;
            case '-':
                sum = subtraction(number1, number2);
                System.out.println(number1 + " - " + number2 + " = " + sum);
                break;
            case '*': case 'x': case 'X':
                sum = multiplication(number1, number2);
                System.out.println(number1 + " * " + number2 + " = "+ sum);
                break;
            case '/':
                sum = division(number1, number2);
                System.out.println(number1 + " / " + number2 + " = "+ sum);
                break;
        }return sum; //För att kunna testa och bygga ut med fler uträkningar
    }
    public static double addition(double number1, double number2){
        return number1 + number2;
    }
    public static double subtraction(double number1, double number2){
        return number1 - number2;
    }
    public static double multiplication(double number1, double number2){
        return number1 * number2;
    }
    public static double division(double number1, double number2){
        return number1 / number2;
    }
}