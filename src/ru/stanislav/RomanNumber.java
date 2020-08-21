package ru.stanislav;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    String value;
    Map<String, Integer> RomanNumbersMap = new HashMap<>();

    public RomanNumber(String value) {
        this.RomanNumbersMap.put("I", 1);
        this.RomanNumbersMap.put("II", 2);
        this.RomanNumbersMap.put("III", 3);
        this.RomanNumbersMap.put("IV", 4);
        this.RomanNumbersMap.put("V", 5);
        this.RomanNumbersMap.put("VI", 6);
        this.RomanNumbersMap.put("VII", 7);
        this.RomanNumbersMap.put("VIII", 8);
        this.RomanNumbersMap.put("IX", 9);
        this.RomanNumbersMap.put("X", 10);

        this.value = value.toUpperCase();
    }

    Boolean isRoman() {
        return this.RomanNumbersMap.containsKey(this.value);
    }

    int toArabicNumber(String romanNumber) {
        return this.RomanNumbersMap.get(romanNumber);
    }
}
