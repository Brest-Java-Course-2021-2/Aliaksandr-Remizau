package com.epam.brest.calc;

import com.epam.brest.price.Price;

import java.math.BigDecimal;

public interface Calc {

    BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal length, BigDecimal pricePerKm);

}
