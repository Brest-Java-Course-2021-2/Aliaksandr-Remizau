package com.epam.brest.calc;

import java.math.BigDecimal;

public interface Calc {
        default BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal length, BigDecimal pricePerKm){
        return weight.multiply(pricePerKg).add(length.multiply(pricePerKm));
    }
}
