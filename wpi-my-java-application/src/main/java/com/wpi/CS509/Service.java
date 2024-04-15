package com.wpi.CS509;

public class Service {
    public String getName(int number){
        if (number < 0){
            return "a";
        } else {
            return "b";
        }
    }
    public int add(int numberA, int numberB){
        return numberA + numberB;
    }

    public char determineLetterGrade (int numberGrade) {
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be less than ZERO");
        }
        else if (numberGrade < 60) {
            return 'F';
        }
        else if (numberGrade <70) {
            return 'D';
        }
        else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        }
        else {
            return 'A';
        }

    }
}
