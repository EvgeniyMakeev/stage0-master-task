package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String numberAsString = "" + number;
        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            String nextValue = String.valueOf(numberAsString.charAt(i));
            sum += Integer.parseInt(nextValue);
        }
        System.out.println(sum);
    }
}
