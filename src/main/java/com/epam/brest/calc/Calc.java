package com.epam.brest.calc;

import com.epam.brest.price.Price;

import java.math.BigDecimal;

public interface Calc {
        default BigDecimal handle(BigDecimal weight,  BigDecimal length){
        return weight.multiply(new Price().choosePrise(weight)).add(length.multiply(new Price().choosePrise(length)));
    }
}
