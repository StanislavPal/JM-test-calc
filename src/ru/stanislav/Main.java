package ru.stanislav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bExit = false;
        int a;
        int b;

        String[] splitExpr;
        String val1;
        String val2;
        String op;

        float result;

        Scanner in = new Scanner(System.in);
        Number number = new Number();
        Calc calc = new Calc();

        while (!bExit) {

            System.out.println("Ввод");
            String expr = in.nextLine();

            try {

                splitExpr = expr.split(" ");
                val1 = splitExpr[0].toUpperCase();
                val2 = splitExpr[2].toUpperCase();
                op = splitExpr[1];


                //System.out.println("is roman: " + (romanNumberA.isRoman() && romanNumberB.isRoman()));

                if ((number.isRoman(val1) && number.isRoman(val2))
                        || (number.isArabic(val1) && number.isArabic(val2))) {
                    if (number.isRoman(val1)) {
                        a = number.toArabicNumber(val1);
                        b = number.toArabicNumber(val2);
                    } else {
                        a = Integer.parseInt(val1);
                        b = Integer.parseInt(val2);
                    }

                    calc.set(a, b, op);
                    result = calc.calculate();

                    if (number.isRoman(val1))
                        System.out.println("Результат: " + number.toRomanNumber((int) result));
                    else
                        System.out.println("Результат: " + result);

                } else {
                    System.out.println("Ошибка ввода: Числа должны быть либо римские, либо арабские!");
                    bExit = true;
                }

            } catch (Exception ex){
                System.out.println("Ошибка ввода: Неправильная выражение! Пример: VII + II или 9 / 3.");
                bExit = true;
            }

        }
        in.close();
    }
}
