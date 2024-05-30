package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isCorrect =
                (firstSide < secondSide + thirdSide) &&
                (secondSide < firstSide + thirdSide) &&
                (thirdSide < firstSide + secondSide);
        String answer = isCorrect ? "this is a valid triangle" : "it's not a triangle";

        System.out.println(answer);
    }

}
