package com.wpi.CS509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestAddIntegers {
    @Test
    void twoPlusTwoEqualsFour() {
        Service service = new Service();
        int result = service.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    void threePlusSevenEqualsTen() {
        Service service = new Service();
        int result = service.add(3, 7);
        assertEquals(10, result);
    }
}