package com.wpi.CS509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestDetermineLetterGrade {
    @Test
    void fiftyNineReturnF(){
        var service = new Service();
        char result = service.determineLetterGrade(59);
        assertEquals('F', result);
    }
    @Test
    void sixtyNineReturnD(){
        var service = new Service();
        char result = service.determineLetterGrade(69);
        assertEquals('D', result);
    }

    @Test
    void seventyNineReturnC(){
        var service = new Service();
        char result = service.determineLetterGrade(79);
        assertEquals('C', result);
    }

    @Test
    void eightyNineReturnB(){
        var service = new Service();
        char result = service.determineLetterGrade(89);
        assertEquals('B', result);
    }

    @Test
    void ninetyNineReturnA(){
        var service = new Service();
        char result = service.determineLetterGrade(99);
        assertEquals('A', result);
    }

    @Test
    void negativeOneReturnsIllegalArgumentException(){
        var service = new Service();
        assertThrows(IllegalArgumentException.class,
                ()->{
            service.determineLetterGrade(-1);
        });

    }
}