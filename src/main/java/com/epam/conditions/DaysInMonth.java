package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isValid = year > 0 && month > 0 && month <= 12;
        if (isValid) {
            int answer = howManyDaysInMonth(year, month);
            System.out.println(answer);
        } else {
            System.out.println("invalid date");
        }
    }

    private int howManyDaysInMonth(int year, int month) {
        int answer;
        boolean isYearAreLeap = (year%4 == 0 && year%100 != 0) || year%400 == 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> answer = 31;
            case 2 -> answer = isYearAreLeap ? 29 : 28;
            default -> answer = 30;
        }
        return answer;
    }

}
