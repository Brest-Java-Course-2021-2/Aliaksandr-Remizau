package com.epam.brest.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

class CalcImplTest {
    Calc calc = new CalcImpl();

    @Test
    void testHandleMethod() {
        BigDecimal weight = new BigDecimal("10");
        BigDecimal weightPrice = new BigDecimal("10");
        BigDecimal distance = new BigDecimal("10");
        BigDecimal distancePrice = new BigDecimal("10");

        assertNotNull(calc);
        assertEquals(new BigDecimal("200"),calc.handle(weight,weightPrice,distance,distancePrice));

    }
    @Test
    void testHandleMethodWithNullParameters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.handle(null,null,null,null);
        });
    }
}