package com.epam.brest.calc;

import com.epam.brest.price.Price;

import java.math.BigDecimal;

public interface Calc {
        default BigDecimal handle(BigDecimal weight,  BigDecimal length){
        return weight.multiply(BigDecimal.valueOf(1)).add(length.multiply(BigDecimal.valueOf(1)));
    }
}
