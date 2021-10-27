package com.epam.brest.calc;

import java.math.BigDecimal;

public class CalcImpl implements Calc{
    @Override
    public BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal distance, BigDecimal pricePerKm) {
        if(weight == null || distance == null || pricePerKg == null || pricePerKm == null){
            throw new IllegalArgumentException("Parameter should  not be NULL");
        }
        return weight.multiply(pricePerKg).add(distance.multiply(pricePerKm));
    }
}

