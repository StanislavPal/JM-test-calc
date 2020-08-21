package ru.stanislav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ввод");

        String expression = reader.nextLine();
        String[] splitExpression = expression.split(" ");
        String value1 = splitExpression[0];
        String value2 = splitExpression[2];
        String op = splitExpression[1];

        RomanNumber romanNumberA = new RomanNumber(value1);
        RomanNumber romanNumberB = new RomanNumber(value2);

        //System.out.println("is roman: " + (romanNumberA.isRoman() && romanNumberB.isRoman()));

        if (romanNumberA.isRoman() && romanNumberB.isRoman()) {
            a = romanNumberA.toArabicNumber(value1);
            b = romanNumberB.toArabicNumber(value2);
        } else {
            a = Integer.parseInt(splitExpression[0]);
            b = Integer.parseInt(splitExpression[2]);
        }

        Calc calc = new Calc(a, b, op);
        float result = calc.calculate();

        System.out.println("Результат: " + result);
    }
}
