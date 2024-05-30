package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numberAsString = "" + number;
        StringBuilder reversNumberAsString = new StringBuilder();
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            reversNumberAsString.append(numberAsString.charAt(i));
        }
        System.out.println(reversNumberAsString);
    }

}
