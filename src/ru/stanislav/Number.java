package ru.stanislav;

import java.util.HashMap;
import java.util.Map;

public class Number {
    Map<String, Integer> arabicNumbers = new HashMap<>();
    Map<Integer, String> romanNumbers = new HashMap<>();

    public Number() {
        this.arabicNumbers.put("I", 1);
        this.arabicNumbers.put("II", 2);
        this.arabicNumbers.put("III", 3);
        this.arabicNumbers.put("IV", 4);
        this.arabicNumbers.put("V", 5);
        this.arabicNumbers.put("VI", 6);
        this.arabicNumbers.put("VII", 7);
        this.arabicNumbers.put("VIII", 8);
        this.arabicNumbers.put("IX", 9);
        this.arabicNumbers.put("X", 10);

        this.romanNumbers.put(1, "I");
        this.romanNumbers.put(2, "II");
        this.romanNumbers.put(3, "III");
        this.romanNumbers.put(4, "IV");
        this.romanNumbers.put(5, "V");
        this.romanNumbers.put(6, "VI");
        this.romanNumbers.put(7, "VII");
        this.romanNumbers.put(8, "VIII");
        this.romanNumbers.put(9, "IX");
        this.romanNumbers.put(10, "X");
        this.romanNumbers.put(20, "XX");
        this.romanNumbers.put(30, "XXX");
        this.romanNumbers.put(40, "XL");
        this.romanNumbers.put(50, "L");
        this.romanNumbers.put(60, "LX");
        this.romanNumbers.put(70, "LXX");
        this.romanNumbers.put(80, "LXXX");
        this.romanNumbers.put(90, "XC");
        this.romanNumbers.put(100, "C");
    }

    //Проверяем строку на соответствие римскому числу из диапазона [I; X]
    Boolean isRoman(String value) {
        return this.arabicNumbers.containsKey(value);
    }

    //Проверяем строку на соответствие арабскому числу из диапазона [1; 10]
    Boolean isArabic(String value) throws Exception {
        int i = Integer.parseInt(value);

        if ((i >= 1) && (i <= 10))
            return true;
        else {
            System.out.println("Ошибка ввода: " + value + " - не число от 1 до 10");
            throw new Exception();
        }
    }

    //Приведение содержимого строки к арабскому числу из римского
    int toArabicNumber(String value) {
        return this.arabicNumbers.get(value);
    }

    //Приведение арабского числа в римское
    String toRomanNumber(int value) {
        int d = value / 10;
        int e = value % 10;

        String result = "";

        if (this.romanNumbers.get(d * 10) != null) {
            result += this.romanNumbers.get(d * 10);
        }

        if (this.romanNumbers.get(e) != null) {
            result += this.romanNumbers.get(e);
        }

        return result;
    }
}
