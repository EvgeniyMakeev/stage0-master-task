package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String result = "Wrong month number";
        switch (monthNumber) {
            case 12, 1, 2 -> result = "Winter";
            case 3, 4, 5 -> result = "Spring";
            case 6, 7, 8 -> result = "Summer";
            case 9, 10, 11 -> result = "Autumn";
        }
        System.out.println(result);
    }

}
