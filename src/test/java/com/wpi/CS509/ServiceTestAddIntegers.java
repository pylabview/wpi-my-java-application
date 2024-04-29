package com.wpi.CS509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Service class's add method.
 *
 * @author Tabnine
 */
public class ServiceTestAddIntegers {

    /**
     * Test method for two plus two equals four.
     *
     * @see Service#add(int, int)
     */
    @Test
    void twoPlusTwoEqualsFour() {
        Service service = new Service();
        int result = service.add(2, 2);
        assertEquals(4, result);
    }

    /**
     * Test method for three plus seven equals ten.
     *
     * @see Service#add(int, int)
     */
    @Test
    void threePlusSevenEqualsTen() {
        Service service = new Service();
        int result = service.add(3, 7);
        assertEquals(10, result);
    }
}