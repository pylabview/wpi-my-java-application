package com.wpi.CS509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestDetermineLetterGrade {
    @Test
    void fiftyNineReturnF(){
        Service service = new Service();
        char result = service.determineLetterGrade(59);
        assertEquals('F', result);
    }
    @Test
    void sixtyNineReturnD(){
        Service service = new Service();
        char result = service.determineLetterGrade(69);
        assertEquals('D', result);
    }

    @Test
    void seventyNineReturnC(){
        Service service = new Service();
        char result = service.determineLetterGrade(79);
        assertEquals('C', result);
    }

    @Test
    void eightyNineReturnB(){
        Service service = new Service();
        char result = service.determineLetterGrade(89);
        assertEquals('B', result);
    }

    @Test
    void ninetyNineReturnA(){
        Service service = new Service();
        char result = service.determineLetterGrade(99);
        assertEquals('A', result);
    }

    @Test
    void negativeOneReturnsIllegalArgumentException(){
        Service service = new Service();
        assertThrows(IllegalArgumentException.class,
                ()->{
            service.determineLetterGrade(-1);
        });

    }
}