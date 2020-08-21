package ru.stanislav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bExit = false;
        int a;
        int b;
        String val1;
        String val2;
        String op;
        String[] splitExpr;

        Scanner in = new Scanner(System.in);


        while (!bExit) {

            System.out.println("Ввод");
            String expr = in.nextLine();

            try {

                splitExpr = expr.split(" ");
                val1 = splitExpr[0];
                val2 = splitExpr[2];
                op = splitExpr[1];

            }
            catch (Exception ex) {
                bExit = true;
                continue;
            }

            RomanNumber romanNumberA = new RomanNumber(val1);
            RomanNumber romanNumberB = new RomanNumber(val2);

            //System.out.println("is roman: " + (romanNumberA.isRoman() && romanNumberB.isRoman()));

            if (romanNumberA.isRoman() && romanNumberB.isRoman()) {
                a = romanNumberA.toArabicNumber(val1);
                b = romanNumberB.toArabicNumber(val2);
            } else {
                a = Integer.parseInt(splitExpr[0]);
                b = Integer.parseInt(splitExpr[2]);
            }

            Calc calc = new Calc(a, b, op);
            float result = calc.calculate();

            System.out.println("Результат: " + result);

        }

        in.close();
    }
}
