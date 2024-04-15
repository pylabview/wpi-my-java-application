package com.wpi.CS509;

/**
 * A class that provides various utility methods.
 *
 * @author Your Name
 */
public class Service {

    /**
     * Returns the string "a" if the input number is less than 0, otherwise returns "b".
     *
     * @param number the input number
     * @return the string "a" if the input number is less than 0, otherwise returns "b"
     */
    public String getName(int number) {
        if (number < 0) {
            return "a";
        } else {
            return "b";
        }
    }

    /**
     * Adds two integers and returns the result.
     *
     * @param numberA the first integer
     * @param numberB the second integer
     * @return the sum of the two integers
     */
    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    /**
     * Determines the letter grade equivalent to the input number grade.
     *
     * @param numberGrade the input number grade
     * @return the letter grade equivalent to the input number grade
     * @throws IllegalArgumentException if the input number grade is less than 0
     */
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be less than ZERO");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
